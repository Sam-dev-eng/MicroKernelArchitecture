package com.paymentService.plugin;

public class StripePlugin implements PaymentPlugin{
    @Override
    public String getName() {
        return "Stripe";
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing stripe payment with amount "+amount+"Naira");

    }
}
