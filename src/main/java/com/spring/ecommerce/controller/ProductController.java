package com.spring.ecommerce.controller;

import com.spring.ecommerce.model.Product;
import com.spring.ecommerce.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
//    POST/Product
//    RequestBody
//    {
//        "title": "test product new",
//            "price": 163.5,
//            "description": "lorem new ipsum set",
//            "image": "https://i.pravahtar.cc",
//            "category": "electronicgd"
//    }

// to use ProductService class here we have to create object of that class here as written below but by using anotation(@service) on FakeStoreProductService class spring is taking care of it.
//
// Private ProductService producservice = new FakeStoreProductService();
//productservice.createProduct(product);

//    to use directly we just need to declare interface reference variable name as written below { private ProductService productService;}
    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService=productService;
    }

//    above we are injecting dependency from product srvice to here.


    @PostMapping("/products")
    public void createProduct(){
//        whenever someone doing post request on "/products"<-- endpoint
//        this method will be executed

// adding comment
//        productService.createProduct(product);
    }
    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable("id") Long productId){
//        whenever someone doing get request on "products/{id}"<-- endpoint
//        this method will be executed
        Product currentProduct= productService.getSingleProduct(productId);
        return currentProduct;

    }

    @GetMapping("/products")
    public void getAllProduct(){
//        whenever someone doing get request on "products"<-- endpoint
//        this method will be executed
    }


}
