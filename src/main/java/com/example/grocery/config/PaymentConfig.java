package com.example.grocery.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.grocery.external_library.*;

@Configuration
public class PaymentConfig {
	@Bean
	public GooglePayProcessor googlePayProcessor() {
		return new GooglePayProcessor();
	}
	
	@Bean
	public CreditCardProcessor creditCardProcessor() {
		return new CreditCardProcessor();
	}
	
	@Bean
	public PaymentProcessorFactory paymentProcessorFactory(GooglePayProcessor gpay, CreditCardProcessor card) {
		return new PaymentProcessorFactory(gpay, card);
	}
	
	@Bean
	public PaymentProcessor paymentProcessor(PaymentProcessorFactory factory) {
		return factory.getPaymentProcessor("gpay"); // Defaulting to Google Pay
	}
}
