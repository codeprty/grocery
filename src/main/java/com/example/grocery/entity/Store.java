package com.example.grocery.entity;

public class Store {
	private String name;
	private String phoneNumber;
	private String[] localities;
	
	// Constructor
	public Store(String name, String phoneNumber, String[] localities) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.localities = localities;
	}
	
	// Getters
	public String getName() {
		return name;
	}
	
	public String phoneNumber() {
		return phoneNumber;
	}
	
	public String[] localities() {
		return localities;
	}
}
