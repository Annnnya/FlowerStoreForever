package ucu.edu.ua.demo.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/payment/paypal")
@RestController
public class PayPalPaymentController {
    @GetMapping
    public String pay(){
        return new PayPalPaymentStrategy().pay(5);
    }
}
