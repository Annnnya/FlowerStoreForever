package ucu.edu.ua.demo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ucu.edu.ua.demo.Item;
import ucu.edu.ua.demo.deliveries.Delivery;
import ucu.edu.ua.demo.payment.Payment;

@Getter@Setter@AllArgsConstructor
public class Order {
    private List<Item> items;
    private Delivery delivery;
    private Payment payment;
    private double order_price(){
        double total = 0;
        for (Item item: items) {
            total += item.getPrice();
        }
        return total;
    }

    public void order_info(){
        System.out.println("Ordered items: " + items.toString()+
                delivery.Deliver(items) +  payment.pay(this.order_price()));
    }

}