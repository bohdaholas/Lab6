package payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {
    @Test
    void pay() {
        PayPalPaymentStrategy paypal = new PayPalPaymentStrategy();
        assertEquals("Paying via Pay pal 100.0 dollars", paypal.pay(100));
        CreditCardPaymentStrategy creditCard = new CreditCardPaymentStrategy();
        assertEquals("Paying via credit card 100.0 dollars", creditCard.pay(100));
    }
}