package ucu.edu.ua.demo.payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public String pay(double money) {
        return "Paid "+money+ "$ with paypal";
    }
}
