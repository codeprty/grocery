package com.example.grocery.external_library;

// Processes payments using a credit card.
public class CreditCardProcessor implements PaymentProcessor {
	
	// Processes the payment and returns success status.
	public boolean process() {
		return true;
	}
}
