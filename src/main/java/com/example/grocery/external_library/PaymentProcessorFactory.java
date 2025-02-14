package com.example.grocery.external_library;

import org.springframework.stereotype.Component;

// Marks this class as a Spring-managed component.
@Component
public class PaymentProcessorFactory {

	// Dependencies on specific payment processors.
    private final GooglePayProcessor gpayProcessor;
    private final CreditCardProcessor cardProcessor;

    // Constructor-based dependency injection for payment processors.
    public PaymentProcessorFactory(GooglePayProcessor gpayProcessor, CreditCardProcessor cardProcessor) {
        this.gpayProcessor = gpayProcessor;
        this.cardProcessor = cardProcessor;
    }

    // Returns the appropriate payment processor based on the payment mode.
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
