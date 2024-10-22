package Assignment4.Strategy;

public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double amount) {
        return amount; // No commission
    }
}
