package nivel3.store;

import nivel3.gateway.PaymentCallback;
import nivel3.gateway.PaymentGateway;
import nivel3.payments.PaymentMethod;

public class ShoeStore implements PaymentCallback {

    private final PaymentGateway gateway;

    public ShoeStore(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void executePayment(PaymentMethod method, double amount) {
        System.out.println("\nShoeStore: Initiating payment...");
        gateway.executePayment(method, amount, this);
    }

    @Override
    public void onPaymentComplete(String status) {
        System.out.println("ShoeStore received callback: " + status);
    }
}
