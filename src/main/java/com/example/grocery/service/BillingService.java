package com.example.grocery.service;

import org.springframework.stereotype.Service;
import com.example.grocery.external_library.PaymentProcessor;
import com.example.grocery.external_library.PaymentProcessorFactory;

// Marks this class as a service component for handling payments.
@Service
public class BillingService {

	// Dependency on PaymentProcessorFactory to retrieve the correct payment processor.
    private final PaymentProcessorFactory paymentProcessorFactory;

    // Constructor-based dependency injection for PaymentProcessorFactory.
    public BillingService(PaymentProcessorFactory paymentProcessorFactory) {
        this.paymentProcessorFactory = paymentProcessorFactory;
    }

    // Processes a peyment using the specified payment mode.
    public boolean completePayment(String paymentMode) {
        PaymentProcessor processor = paymentProcessorFactory.getPaymentProcessor(paymentMode);
        if (processor == null) {
            return false; // Returns false if the provided payment mode is invalid.
        }
        return processor.process();
    }
}
