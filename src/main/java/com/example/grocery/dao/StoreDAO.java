package com.example.grocery.dao;

import com.example.grocery.entity.Store;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StoreDAO {
	private final List<Store> stores = new ArrayList<>();
	
	// Method to add a store to the list
	public void addStore(Store store) {
		stores.add(store);
	}
	
	// Method to retrieve all stores
	public List<Store> getAllStores() {
		return stores;
	}
}
