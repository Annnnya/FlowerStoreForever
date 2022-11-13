package ucu.edu.ua.demo.flower_decorators;

import ucu.edu.ua.demo.Item;
import ucu.edu.ua.demo.flower.Flower;
import ucu.edu.ua.demo.flower.Tulip;



public class BasketDecorator extends ItemDecorator{
    private Item item;

    public BasketDecorator(Flower flower) {
        super(flower);
        this.item = new Item(flower);
    }
    public double getPrice() {
        return 4 + item.getPrice();
    }

    @Override
    public String getDescription() {
        item.setCharacteristics(item.getCharacteristics() + " in the basket");
        return item.getCharacteristics();
    }

    public static void main(String[] args) {
        Item fl = new Item(new Tulip(8));
        fl.setCharacteristics("gorgeous");
        System.out.println(fl.getCharacteristics());
        System.out.println(fl.getPrice());
        BasketDecorator flb = new BasketDecorator(new Tulip(8));
        System.out.println(flb.getDescription());
        System.out.println(flb.getPrice());
    }
}
