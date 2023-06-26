package com.myproject.marketorder.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.myproject.marketorder.model.Product;
import com.myproject.marketorder.model.repository.MarketRepository;

@Service
public class MarketService {

    private final MarketRepository marketRepository;

    public MarketService(MarketRepository marketRepository) {
        this.marketRepository = marketRepository;
    }

    public Optional<Product> findProductById(Integer productId){
        return marketRepository.findById(productId);
    }
    
}
