package ucu.edu.ua.demo.deliveries;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ucu.edu.ua.demo.Item;

import java.util.List;

@Getter@Setter@AllArgsConstructor
public class DHLDeliveryStrategy implements Delivery{
    private String destination;
    private String name;
    @Override
    public String Deliver(List<Item> items) {
        return "Items are being delivered by DHL to the address "+this.destination+
                ". The name of the receiver is "+this.name;
    }
}
