package com.olayinka.Springdemo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Service;

import com.olayinka.Springdemo.model.Product;

@Service
public class ProductService {
	
	
	List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, "Iphone 16", 2500.00), new Product(2, "Samsung A21", 350.50), new Product(3, "Motorolla", 450.76)));
	
	
	public List<Product> getProducts(){
		
		return products;
		
	}
	
	public Product getSingleProduct(int prodId) {
		
		return products.stream().filter(p -> p.getProductId() == prodId).findFirst().get();
	}
	
	public void addNewProduct (Product prod) {
		products.add(prod);
	}
}
