package com.example.grocery.external_library;

import org.springframework.stereotype.Component;

@Component
public class PaymentProcessorFactory {
	private GooglePayProcessor gpayProcessor = new GooglePayProcessor();
	private CreditCardProcessor cardProcessor = new CreditCardProcessor();
	
	public PaymentProcessorFactory(GooglePayProcessor gpayProcessor, CreditCardProcessor cardProcessor) {
		this.gpayProcessor = gpayProcessor;
		this.cardProcessor = cardProcessor;
	}
	
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
