package com.example.machinetest.repo;

import com.example.machinetest.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products,Integer> {
}
