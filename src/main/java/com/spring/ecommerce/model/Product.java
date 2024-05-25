package com.spring.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private long id;
    private String title;
    private String description;
    private String imageUrl;
    private double price;
    private Category category;
}
