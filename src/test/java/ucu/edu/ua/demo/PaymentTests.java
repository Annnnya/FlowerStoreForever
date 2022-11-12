package ucu.edu.ua.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ucu.edu.ua.demo.payment.CreditCardPaymentStrategy;
import ucu.edu.ua.demo.payment.PayPalPaymentStrategy;

public class PaymentTests {
    @Test
    public void PaypalTest(){
        Assertions.assertEquals(new PayPalPaymentStrategy().pay(30),
                "Paid 30.0$ with paypal");
    }

    @Test
    public void CreditCardTest(){
        Assertions.assertEquals(new CreditCardPaymentStrategy().pay(30),
                "Paid 30.0$ with credit card");
    }

}
