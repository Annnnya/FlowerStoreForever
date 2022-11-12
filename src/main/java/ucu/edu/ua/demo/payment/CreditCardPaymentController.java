package ucu.edu.ua.demo.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/payment/credit-card")
@RestController
public class CreditCardPaymentController {
    @GetMapping
    public String pay(){
        return new CreditCardPaymentStrategy().pay(10);
    }
}
