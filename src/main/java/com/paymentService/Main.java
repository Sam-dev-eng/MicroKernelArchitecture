package com.paymentService;

import com.paymentService.core.PluginProcessor;
import com.paymentService.core.PluginRegistry;
import com.paymentService.plugin.PaypalPlugin;
import com.paymentService.plugin.StripePlugin;

public class Main {
    static void main() {
        PluginRegistry pluginRegistry = new PluginRegistry();
        pluginRegistry.register(new PaypalPlugin());
        pluginRegistry.register(new StripePlugin());

        PluginProcessor processor = new PluginProcessor(pluginRegistry);
        processor.process("PayPal",1000);
        processor.process("Stripe",2000);
    }
}
