package ucu.edu.ua.demo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ucu.edu.ua.demo.deliveries.DHLDeliveryStrategy;
import ucu.edu.ua.demo.deliveries.PostDeliveryStrategy;
import ucu.edu.ua.demo.flower.Rose;
import ucu.edu.ua.demo.flower.Tulip;

import java.util.ArrayList;

public class DeliveryTests {
    private ArrayList<Item> items = new ArrayList<Item>();

    @BeforeEach
    public void createItem(){
        items.add(new Item(new Tulip(7)));
        items.add(new Item(new Rose(10)));
    }
    @Test
    public void PostTest(){
        Assertions.assertEquals(new PostDeliveryStrategy("London").Deliver(items),
                "Items are being delivered by post to the address London");
    }
    @Test
    public void DHLTest(){
        Assertions.assertEquals(new DHLDeliveryStrategy("London", "You").Deliver(items),
                "Items are being delivered by DHL to the address London"+
                        ". The name of the receiver is You");
    }
}
