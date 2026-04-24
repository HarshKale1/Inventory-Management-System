package com.program.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.program.inventory.entity.Product;
import com.program.inventory.service.InventoryService;

@Controller
public class MyController {

	@Autowired
	InventoryService service;

	@GetMapping("/")
	public String home() {
		return "redirect:/index.html";
	}

	@GetMapping("/addpage")
	public String addPage(Model model) {
		model.addAttribute("product", new Product());
		return "addpage";
	}

	@PostMapping("/addprod")
	public String add(@ModelAttribute Product product, Model model) {

		service.addProduct(product.getName(), product.getQty());
		model.addAttribute("msg", "Product Added Successfully");

		return "addpage";
	}
	
	@GetMapping("/updatepage")
	public String updatePage(Model model) {
		model.addAttribute("product", new Product());
		return "updatepage";
	}
	
	@PostMapping("/updateq")
	public String update(@ModelAttribute Product product, Model model) {

		boolean status = service.updateQty(product.getName(), product.getQty());

		if (status) {
			model.addAttribute("msg", "Updated Successfully");
		} else {
			model.addAttribute("msg", "Product Not Found");
		}

		return "updatepage";
	}

	@GetMapping("/removepage")
	public String removePage(Model model) {
		model.addAttribute("product", new Product());
		return "removepage";
	}
	
	@PostMapping("/removeP")
	public String delete(@ModelAttribute Product product, Model model) {

		boolean status = service.deleteProduct(product.getName());

		if (status) {
			model.addAttribute("msg", "Deleted Successfully");
		} else {
			model.addAttribute("msg", "Product Not Found");
		}

		return "removepage";
	}

	@GetMapping("/viewpage")
	public String viewPage(Model model) {
		List<Product> list = service.viewProducts();
		model.addAttribute("products", list);
		return "viewpage";
	}
}