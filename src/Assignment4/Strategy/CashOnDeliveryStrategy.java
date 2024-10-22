package Assignment4.Strategy;

public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double amount) {
        return amount + 300; // 300 rubles for delivery
    }
}
