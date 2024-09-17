package com.olayinka.Springdemo;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.olayinka.Springdemo.controller.ProductController;
import com.olayinka.Springdemo.model.Dev;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringdemoApplication.class, args);
		
	 File file = new File(new File("").getAbsolutePath(), "file/testing");
		
     Path path = Paths.get("file/testing");
     System.out.println(file.getAbsolutePath());
     if(Files.exists(path)) {
    	 System.out.println("The file exist");
     }else {    
     System.out.println("The class does not exist");
	}
	}

}
