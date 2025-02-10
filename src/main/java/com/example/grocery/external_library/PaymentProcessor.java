// This is an interface that defines a contract for payment processing.

// Defines the package where this interface belongs.
package com.example.grocery.external_library;

// Declares an interface
public interface PaymentProcessor {
	// Defines a method without implementation (will be implemented by GooglePayProcessor and CreditCardProcessor).
	boolean process();
}
