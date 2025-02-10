package com.example.grocery.service;

import com.example.grocery.dao.StoreDAO;
import com.example.grocery.entity.Store;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
	private final StoreDAO storeDAO;
	
	// Constructor-based dependency injection
	public StoreService(StoreDAO storeDAO) {
		this.storeDAO = storeDAO;
	}
	
	// Method to add a store
	public void addStore(Store store) {
		storeDAO.addStore(store);
	}
}
