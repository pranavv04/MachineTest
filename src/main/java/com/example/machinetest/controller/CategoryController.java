package com.example.machinetest.controller;


import com.example.machinetest.model.Category;
import com.example.machinetest.service.CategoryService;
import com.example.machinetest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    CategoryService service;

    @Autowired
    ProductService productService;


    @GetMapping("/categories")
    public List<Category> getCategory(){
        return service.getCategory();
    }

    @GetMapping("/categories/{categoryId}")
    public Category getCategoryById(@PathVariable  int categoryId){
        return service.getCategoryById(categoryId);
    }

    @PostMapping("/categories")
    public String addCategory(@RequestBody  Category category){
        service.addCategory(category);
        return "New category added";
    }

    @PutMapping("/categories/{categoryId}")
    public String updateCategory(@PathVariable  int categoryId, @RequestBody Category category){
        service.updateCategory(categoryId, category);
        return "Category updated";
    }

    @DeleteMapping("/categories/{categoryId}")
    public String deleteCategory(@PathVariable int categoryId){
        service.deleteCategory(categoryId);
        return "Category Deleted";
    }


}
