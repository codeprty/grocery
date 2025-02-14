package com.example.grocery.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.grocery.external_library.CreditCardProcessor;
import com.example.grocery.external_library.GooglePayProcessor;
import com.example.grocery.external_library.PaymentProcessorFactory;

// Marks this class as a configuration class for Spring-managed beans.
@Configuration
public class PaymentConfig {

	// Creates a bean for GooglePayProcessor.
    @Bean
    GooglePayProcessor googlePayProcessor() {
        return new GooglePayProcessor();
    }

    // Creates a bean for CreditCardProcessor.
    @Bean
    CreditCardProcessor creditCardProcessor() {
        return new CreditCardProcessor();
    }

    // Creates a bean for PaymentProcessorFactory with dependencies injected.
    @Bean
    PaymentProcessorFactory paymentProcessorFactory(GooglePayProcessor gpay, CreditCardProcessor card) {
        return new PaymentProcessorFactory(gpay, card);
    }
}
