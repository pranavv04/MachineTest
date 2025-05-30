package com.example.machinetest.service;

import com.example.machinetest.model.Category;
import com.example.machinetest.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {


    @Autowired
    CategoryRepo repo;
    public List<Category> getCategory(){
        return repo.findAll();
    }

    public Category getCategoryById(int categoryId){
        return repo.findById(categoryId).orElse(new Category());
    }

    public void addCategory(Category category){
        repo.save(category);
    }
    public void updateCategory(int categoryId, Category category) {
        Category exisiting = repo.findById(categoryId)
        .orElseThrow(() -> new RuntimeException("Category not found"));

        exisiting.setName(category.getName());
        exisiting.setDescription(category.getDescription());
        repo.save(exisiting);
    }
    public void deleteCategory(int categoryId){
        repo.deleteById(categoryId);
    }


}
