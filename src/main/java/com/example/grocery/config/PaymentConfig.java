// This is a Spring configuration class that defines Beans (objects that Spring will manage).

// This package organizes configuration classes.
package com.example.grocery.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.grocery.external_library.*;

//@Configuration - Marks this class as a configuration class (tells Spring to look here for beans).
@Configuration
public class PaymentConfig {
	//@Bean - Marks methods that return objects Spring should manage.
	// Creates a GooglePayProcessor bean.
	// When Spring needs a GooglePayProcessor, it will automatically use this method to create one.
	@Bean
	public GooglePayProcessor googlePayProcessor() {
		return new GooglePayProcessor();
	}
	
	// Creates a CreditCardProcessor bean.
	// When Spring needs a CreditCardProcessor, it will automatically use this method.
	@Bean
	public CreditCardProcessor creditCardProcessor() {
		return new CreditCardProcessor();
	}
	
	// Creates a PaymentProcessorFactory bean and injects gpay and card as dependencies.
	// The factory helps select the correct payment processor.
	@Bean
	public PaymentProcessorFactory paymentProcessorFactory(GooglePayProcessor gpay, CreditCardProcessor card) {
		return new PaymentProcessorFactory(gpay, card);
	}
	
	// Calls the factory's getPaymentProcessor("gpay") method.
	// This means, by default, Google Pay is used as the payment method.
	@Bean
	public PaymentProcessor paymentProcessor(PaymentProcessorFactory factory) {
		return factory.getPaymentProcessor("gpay");
	}
}
