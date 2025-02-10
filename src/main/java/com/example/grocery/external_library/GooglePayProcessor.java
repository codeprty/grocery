// This class implements the PaymentProcessor interface.

// Defines the package.
package com.example.grocery.external_library;

// Declares a class that implements the PaymentProcessor interface.
public class GooglePayProcessor implements PaymentProcessor {
	// Implements the process() method.
	// Always returns true (simulating successful payment).
	public boolean process() {
		return true;
	}
}
