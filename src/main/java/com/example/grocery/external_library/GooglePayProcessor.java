package com.example.grocery.external_library;

// Processes payments using Google Pay.
public class GooglePayProcessor implements PaymentProcessor {
	
	// Processes the payment and returns success status.
	public boolean process() {
		return true;
	}
}
