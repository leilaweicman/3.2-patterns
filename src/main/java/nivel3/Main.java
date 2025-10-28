package nivel3;

import nivel3.gateway.PaymentGateway;
import nivel3.payments.BankTransfer;
import nivel3.payments.CreditCard;
import nivel3.payments.Paypal;
import nivel3.store.ShoeStore;

public class Main {
    public static void main(String[] args) {
        ShoeStore shoeStore = new ShoeStore(new PaymentGateway());
        shoeStore.executePayment(new CreditCard(), 20);
        shoeStore.executePayment(new Paypal(), 30);
        shoeStore.executePayment(new BankTransfer(), 40);
    }
}
