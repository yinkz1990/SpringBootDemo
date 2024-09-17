package com.olayinka.Springdemo.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements ILaptop {


@Override
	
   public String compile() {
		return "Compiling bug in Laptop 1";
	}
}
