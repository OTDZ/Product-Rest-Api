package com.otdz.productspringrestapi.controller;

import com.otdz.productspringrestapi.entity.Product;
import com.otdz.productspringrestapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private ProductRepository productRepository;

    // Dependency injection
    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @GetMapping("/product/all")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

}
