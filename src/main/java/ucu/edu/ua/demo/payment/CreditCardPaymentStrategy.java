package ucu.edu.ua.demo.payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public String pay(double money) {
        return  "Paid "+money+ "$ with credit card";
    }
}
