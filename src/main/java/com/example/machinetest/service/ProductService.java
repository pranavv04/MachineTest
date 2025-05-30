package com.example.machinetest.service;

import com.example.machinetest.model.Products;
import com.example.machinetest.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Products> getAllProducts(){
        return repo.findAll();
    }
    public Products getProductById(int productId){
        return repo.findById(productId).orElse(new Products());
    }
    public void addProducts(Products products){
        repo.save(products);
    }

    public void updateProduct(int productId, Products products){
        Products exist = repo.findById(productId)
                .orElseThrow(()-> new RuntimeException("Product not found"));

        exist.setName(products.getName());
        exist.setDescription(products.getDescription());
        exist.setPrice(products.getPrice());
        exist.setImageUrl(products.getImageUrl());
        exist.setCategory(products.getCategory());
        repo.save(exist);

    }
    public void deleteProduct(int productId){
        repo.deleteById(productId);
    }


}
