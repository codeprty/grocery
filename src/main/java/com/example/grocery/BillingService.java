// This class handles payment processing by using a payment processor.

// This defines the package where this class belongs.
package com.example.grocery;

// This imports the @Service annotation from Spring
// It tells Spring that this class is a service component (business logic class).
import org.springframework.stereotype.Service;

// This imports PaymentProcessor, which is an interface that handles payment processing.
import com.example.grocery.external_library.PaymentProcessor;

// @Service - Marks this class as a Spring service so that Spring can automatically create and manage its objects.
@Service
public class BillingService {
	// Declares a variable type PaymentProcessor
	// This variable will store the payment processing object (like Google Pay or Credit Card).
	private PaymentProcessor paymentProcessor;
	
	// This is a constructor - a special method that runs when the object is created.
	// It takes a PaymentProcessor as a parameter (Google Pay or Credit Card).
	public BillingService(PaymentProcessor paymentProcessor) {
		// this.paymentProcessor refers to the class variable.
		// paymentProcessor is the method parameter.
		// It assigns the parameter value to the class variable.
		this.paymentProcessor = paymentProcessor;
	}
	
	// A method that processes the payment and returns true if successful.
	public boolean completePayment() {
		// Calls the process() method on paymentProcessor.
		// process() is defined in the PaymentProcessor interface (implemented by Google Pay or Credit Card).
		return paymentProcessor.process();
	}
}
