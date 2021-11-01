package payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
        return "Paying via credit card " + price + " dollars";
    }
}
