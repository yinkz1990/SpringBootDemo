package com.olayinka.Springdemo.controller;



	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class HomeController {
	

		@RequestMapping("/")   // The slash signify home page
		public String greet() {
			return "Hello World, welcome to the winning team.";
		}
		
		@RequestMapping("/about")
		public String aboutUs() {
			return " You are getting the information"
					+ " About this page"
					+ " Click on the button below to view more";
		}
	}



