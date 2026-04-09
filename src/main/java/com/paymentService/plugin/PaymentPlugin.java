package com.paymentService.plugin;

public interface PaymentPlugin {
    String getName();
    void processPayment(double amount);
}
