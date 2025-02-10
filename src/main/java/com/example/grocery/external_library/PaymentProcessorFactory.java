// This class decides which payment processor to use.

// Defines the package.
package com.example.grocery.external_library;

// Imports the @Component annotation from Spring.
// This annotation allows Spring to automatically detect and manage this class as a Spring bean.
import org.springframework.stereotype.Component;

// @Component tells Spring that this class is a Spring-managed bean.
// This means Spring will automatically create an instance of this class and make it available for use.
@Component
// Declares a class named PaymentProcessorFactory
public class PaymentProcessorFactory {
	// Declares two private variables that store instances of GooglePayProcessor and CreditCardProcessor.
	private final GooglePayProcessor gpayProcessor;
	private final CreditCardProcessor cardProcessor;
	
	// Constructor that takes two parameters and assigns them to the instance variables.
	public PaymentProcessorFactory(GooglePayProcessor gpayProcessor, CreditCardProcessor cardProcessor) {
		this.gpayProcessor = gpayProcessor;
		this.cardProcessor = cardProcessor;
	}
	
	// Method that returns the appropriate payment processor based on the mode (gpay or credit_card)
	// If the mode is "gpay", it returns the gpayProcessor.
	// If the mode is "credit_card", it returns the cardProcessor.
	// If neither, it returns null (invalid payment mode).
	public PaymentProcessor getPaymentProcessor(String paymentMode) {
		if ("gpay".equalsIgnoreCase(paymentMode)) {
			return gpayProcessor;
		} else if ("credit_card".equalsIgnoreCase(paymentMode)) {
			return cardProcessor;
		} else {
			return null;
		}
	}
}
