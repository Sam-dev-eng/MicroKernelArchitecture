package com.paymentService.plugin;

public class PaypalPlugin implements PaymentPlugin{
    @Override
    public String getName() {
        return "PayPal";
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal payment is proccessing with "+amount+ " Naira");
    }
}
