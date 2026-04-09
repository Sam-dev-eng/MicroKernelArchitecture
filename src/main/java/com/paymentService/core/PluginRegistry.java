package com.paymentService.core;

import com.paymentService.plugin.PaymentPlugin;

import java.util.HashMap;
import java.util.Map;

public class PluginRegistry {
    private Map<String, PaymentPlugin> plugins = new HashMap<>();

    public void register(PaymentPlugin plugin){
        plugins.put(plugin.getName(), plugin);
    }
    public PaymentPlugin getPlugin(String name){
        return plugins.get(name);
    }
}
