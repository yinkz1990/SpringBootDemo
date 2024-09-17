package com.olayinka.Springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
	
	@RequestMapping("/login")
	public String login() {
		
		
		return "You are logged in";
	}
	
	
	
	

}
