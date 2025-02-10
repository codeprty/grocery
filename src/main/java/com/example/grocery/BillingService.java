// This class handles payment processing by using a payment processor.

// This defines the package where this class belongs.
package com.example.grocery;

// This imports the @Service annotation from Spring.
// @Service tells Spring that this class is a service component (business logic class).
import org.springframework.stereotype.Service;

// This imports PaymentProcessor, which is an interface that handles payment processing.
import com.example.grocery.external_library.PaymentProcessor;

@Service
public class BillingService {
	private PaymentProcessor paymentProcessor;
	
	public BillingService(PaymentProcessor paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
	}
	
	public boolean completePayment() {
		return paymentProcessor.process();
	}
}
