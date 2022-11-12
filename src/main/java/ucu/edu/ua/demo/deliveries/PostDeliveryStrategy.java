package ucu.edu.ua.demo.deliveries;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ucu.edu.ua.demo.Item;

import java.util.List;

@Getter@Setter@AllArgsConstructor
public class PostDeliveryStrategy implements Delivery {
    private String destination;

    @Override
    public String Deliver(List<Item> items) {
        return "Items are being delivered by post to the address "+this.destination;
    }

}
