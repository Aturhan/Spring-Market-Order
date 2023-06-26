package com.myproject.marketorder.dto;

import java.util.List;

import lombok.Data;

@Data
public class OrderRequest {
    private List<Integer> productIdList;
    private String userName;
    
    
}
