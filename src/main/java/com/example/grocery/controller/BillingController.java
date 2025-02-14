package com.example.grocery.controller;

import org.springframework.web.bind.annotation.*;
import com.example.grocery.service.BillingService;
import org.springframework.http.ResponseEntity;

//Marks this class as a REST controller and maps requests to "/api/billing".
@RestController
@RequestMapping("/api/billing")
public class BillingController {

	// Dependency on BillingService for payment processing.
    private final BillingService billingService;

    // Constructor-based dependency injection for BillingService.
    public BillingController(BillingService billingService) {
        this.billingService = billingService;
    }
    
    // Handles HTTP POST requests to process a payment.
    // Accepts a "paymentMode" parameter to determine the payment method.
    @PostMapping("/pay")
    public ResponseEntity<String> completePayment(@RequestParam String paymentMode) {
        boolean success = billingService.completePayment(paymentMode);
        return success 
                ? ResponseEntity.ok("Payment successful") 
                : ResponseEntity.badRequest().body("Invalid payment mode");
    }
}
