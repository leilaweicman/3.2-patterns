package nivel3.payments;

public class Paypal implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + "...");
    }
}
