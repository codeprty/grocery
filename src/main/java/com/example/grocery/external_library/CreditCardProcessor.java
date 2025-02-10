package com.example.grocery.external_library;

public class CreditCardProcessor implements PaymentProcessor {
	public boolean process() {
		return true;
	}
}
