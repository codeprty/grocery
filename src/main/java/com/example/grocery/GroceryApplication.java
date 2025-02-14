package com.example.grocery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Marks this class as a Spring Boot application with auto-configuration enabled.
@SpringBootApplication
public class GroceryApplication {

	// Main method to launch the application.
	public static void main(String[] args) {
		SpringApplication.run(GroceryApplication.class, args);
	}

}
