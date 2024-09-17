package com.olayinka.Springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olayinka.Springdemo.model.Product;
import com.olayinka.Springdemo.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/products")  //Use GetMapping in place of RequestMapping for get request
	public List<Product> getProduct(){
		
		return service.getProducts();
	}
	
	@GetMapping("/product/{prodId}")   //Use GetMapping in place of RequestMapping for get request
	
	public Product getProductById(@PathVariable int prodId) {
		
		return service.getSingleProduct(prodId);
	}
	
	@PostMapping("/product")
	public void addProduct(@RequestBody Product prod) {
		System.out.println(prod);
		service.addNewProduct(prod);
	}

}
