package com.myproject.marketorder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Table
@Data
@Entity
@Getter
@Setter
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;

    private String name;
    private  double price;
    private int quantity;
}
