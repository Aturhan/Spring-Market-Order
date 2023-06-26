package com.myproject.marketorder.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.marketorder.model.Product;

public interface MarketRepository extends JpaRepository<Product, Integer> {

    
}
