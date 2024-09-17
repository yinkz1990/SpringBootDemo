package com.olayinka.Springdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Dev {
	@Autowired
	private ILaptop laptop;
	
//	public Dev (Laptop laptop) {
//		this.laptop = laptop;
//	}

	public void debug() {
	var bug = laptop.compile();
	
	System.out.println("We are debugging the laptop " + bug);
	}
	
	
}
