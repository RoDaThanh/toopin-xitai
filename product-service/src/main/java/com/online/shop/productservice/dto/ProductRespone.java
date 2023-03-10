package com.online.shop.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductRespone {
    private String id;
    private String name;
    private String description;
    private String img;
    private BigDecimal price;
    private String productTypeId;
}
