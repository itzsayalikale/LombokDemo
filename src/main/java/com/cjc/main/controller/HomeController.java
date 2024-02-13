package com.cjc.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Product;

@RestController
public class HomeController {

	@GetMapping("/prod")
	public void saveProduct() {
		
		Product product=new Product();
		product.setProductId(23);
		product.setProductName("Laptop");
		product.setProductPrice(2500);
		product.setAvailableQuantity(45);
		
		System.out.println(product.getProductId());
		System.out.println(product.getProductName());
		System.out.println(product.getProductPrice());
		System.out.println(product.getAvailableQuantity());
		
		
		Product p1=new Product(20,"cpu",5000,35);
		System.out.println(p1);
	}
}
