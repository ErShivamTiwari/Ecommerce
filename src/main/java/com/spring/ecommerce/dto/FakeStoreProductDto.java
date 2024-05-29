package com.spring.ecommerce.dto;

import com.spring.ecommerce.model.Category;
import com.spring.ecommerce.model.Product;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

@Getter
@Setter
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;

    public Product toProduct() {

            Product p = new Product();
            p.setId(id);
            p.setTitle(title);
            p.setPrice(price);
            p.setDescription(description);
            p.setImageUrl(image);

            Category cat= new Category();
            cat.setTitle(category);
            p.setCategory(cat);

        return p;

    }


}
