package com.myproject.marketorder.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.myproject.marketorder.model.Order;
import com.myproject.marketorder.model.Product;
import com.myproject.marketorder.model.repository.OrderRepository;

@Service
public class OrderService {
    private final MarketService marketService;
    private final OrderRepository orderRepository;
   

    public OrderService(MarketService marketService, OrderRepository orderRepository) {
        this.marketService = marketService;
        this.orderRepository = orderRepository;
    }


    public Order getOrder(List<Integer> productIdList, String userName){
        List<Optional <Product>> productList = productIdList.stream()
        .map(marketService::findProductById).collect(Collectors.toList());

        Double totalPrice = productList.stream()
        .map(optionalProduct -> optionalProduct.map(Product::getPrice).orElse(0.0))
        .reduce(0.0,Double::sum);
        
        Order order = Order.builder()
        .producList(productIdList)
        .totalPrice(totalPrice)
        .userName(userName)
        .build();

        return orderRepository.save(order);
    }
}
