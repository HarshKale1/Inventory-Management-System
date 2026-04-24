package com.program.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.program.inventory.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}