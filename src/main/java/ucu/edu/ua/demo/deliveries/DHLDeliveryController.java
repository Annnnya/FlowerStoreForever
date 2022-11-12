package ucu.edu.ua.demo.deliveries;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ucu.edu.ua.demo.Item;

import java.util.ArrayList;

@RequestMapping("/delivery/DHL")
@RestController
public class DHLDeliveryController {

    @GetMapping
    public String pay(){
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(4, "rose"));
        return new DHLDeliveryStrategy("Lviv", "Vasyl")
                .Deliver(items);
    }
}
