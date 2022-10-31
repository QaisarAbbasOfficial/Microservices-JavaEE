package com.websool.productservice.models.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductRequest {
    private String name;
    private Double price;
    private String image;
    private Integer quantity;
    private String description;
}
