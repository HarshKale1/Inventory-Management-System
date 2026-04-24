package com.program.inventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.program.inventory.entity.Product;
import com.program.inventory.repository.ProductRepo;

@Service
public class InventoryService {

    @Autowired
    private ProductRepo repo;
    public void addProduct(String name, int qty) {
        Product product = new Product();
        product.setName(name);
        product.setQty(qty);
        repo.save(product);
    }

    public boolean updateQty(String name, int qty) {
        Product p = repo.findByName(name);
        if (p != null) {
            p.setQty(qty);
            repo.save(p);
            return true;
        }
        return false;
    }

    public boolean deleteProduct(String name) {
        Product p = repo.findByName(name);
        if (p != null) {
            repo.delete(p);
            return true;
        }
        return false;
    }

    public List<Product> viewProducts() {
        return repo.findAll();
    }
}