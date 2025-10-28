package nivel3.payments;

public class CreditCard implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount + "...");
    }
}
