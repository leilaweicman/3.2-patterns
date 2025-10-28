package nivel3.payments;

public class BankTransfer implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer of $" + amount + "...");
    }
}
