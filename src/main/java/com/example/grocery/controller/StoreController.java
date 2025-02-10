package com.example.grocery.controller;

import com.example.grocery.entity.Store;
import com.example.grocery.service.StoreService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stores")
public class StoreController {
	private final StoreService storeService;
	
	// Constructor-based dependency injection
	public StoreController(StoreService storeService) {
		this.storeService = storeService;
	}
	
	// POST method to add a store
	@PostMapping
	public String addStore(@RequestBody Store store) {
		storeService.addStore(store);
		return "Store added successfully!";
	}
}
