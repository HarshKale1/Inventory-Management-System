package com.program.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.program.inventory.entity.Inventory;

public interface InventoryRepo extends JpaRepository<Inventory, Integer> {
	
}