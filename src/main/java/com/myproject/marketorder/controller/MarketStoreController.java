package com.myproject.marketorder.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.marketorder.dto.OrderRequest;
import com.myproject.marketorder.model.Order;
import com.myproject.marketorder.service.OrderService;

@RestController
@RequestMapping("/v1/myMarket")
public class MarketStoreController {
    
    private final OrderService orderService;


    public MarketStoreController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<String> first(){
        return ResponseEntity.ok("Test!!");
    }

    @PostMapping
    public ResponseEntity<Order> getOrder(@RequestBody OrderRequest orderRequest){

        Order order = orderService.getOrder(orderRequest.getProductIdList(), orderRequest.getUserName());

        return ResponseEntity.ok(order);

    }
}
