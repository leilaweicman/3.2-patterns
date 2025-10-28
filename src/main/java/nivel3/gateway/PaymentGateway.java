package nivel3.gateway;

import nivel3.payments.PaymentMethod;

public class PaymentGateway {
    public void executePayment(PaymentMethod method, double amount, PaymentCallback callback) {
        System.out.println("\nStarting payment process...");
        method.processPayment(amount);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        callback.onPaymentComplete("Payment of $" + amount + " processed successfully.");
    }
}
