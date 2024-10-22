package Assignment4.Strategy;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double amount) {
        return amount * 1.02; // 2% commission
    }
}
