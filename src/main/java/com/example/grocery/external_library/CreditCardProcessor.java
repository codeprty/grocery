// Similar to GooglePayProcessor, but for credit card payments.

// Defines the package.
package com.example.grocery.external_library;

// Declares a class that implements PaymentProcessor.
public class CreditCardProcessor implements PaymentProcessor {
	// Implements process(), always returning true.
	public boolean process() {
		return true;
	}
}
