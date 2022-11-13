package ucu.edu.ua.demo.flower_decorators;

import lombok.AllArgsConstructor;
import ucu.edu.ua.demo.Item;
import ucu.edu.ua.demo.flower.Flower;


public abstract class ItemDecorator extends Item {

    public ItemDecorator(Flower flower) {
        super(flower);
    }

    public abstract String getDescription();
}
