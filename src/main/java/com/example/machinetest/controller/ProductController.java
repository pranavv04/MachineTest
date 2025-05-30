package com.example.machinetest.controller;

import com.example.machinetest.model.Products;
import com.example.machinetest.repo.ProductRepo;
import com.example.machinetest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @Autowired
    ProductRepo repo;


    @GetMapping("/products")
    public Page<Products>getPaginatedProducts(@RequestParam(defaultValue = "0")int page, @RequestParam(defaultValue = "5")int size){
        Pageable pageable = PageRequest.of(page,size);
        return repo.findAll(pageable);
    }

    @GetMapping("/products/{productId}")
    public Products getProductById(@PathVariable int productId){
        return service.getProductById(productId);
    }



    @PostMapping("/products")
    public String addProducts(@RequestBody Products products){
        service.addProducts(products);
        return "Product Added";
    }

    @PutMapping("/products/{productId}")
    public String updateProduct(@PathVariable int productId, @RequestBody Products products){
        service.updateProduct(productId,products);
        return "Product Updated";
    }


    @DeleteMapping("/products/{productId}")
    public String deleteProduct(@PathVariable int productId){
        service.deleteProduct(productId);
        return "Product Deleted";
    }
}
