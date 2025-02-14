package com.example.grocery.external_library;

// Defines a contract for payment processing implementations.
public interface PaymentProcessor {
	
	// Processes the payment and returns success status.
	boolean process();
}
