package com.paymentService.core;

import com.paymentService.plugin.PaymentPlugin;

public class PluginProcessor {

    private PluginRegistry registry;

    public PluginProcessor(PluginRegistry registry){
        this.registry = registry;
    }

    public void process(String name, double amount){
        PaymentPlugin plugin = registry.getPlugin(name);
        if (plugin == null){
            throw new RuntimeException("Plugin not found");
        }
        plugin.processPayment(amount);
    }
}
