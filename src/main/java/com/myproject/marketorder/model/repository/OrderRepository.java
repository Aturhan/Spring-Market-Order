package com.myproject.marketorder.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.marketorder.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    
}
