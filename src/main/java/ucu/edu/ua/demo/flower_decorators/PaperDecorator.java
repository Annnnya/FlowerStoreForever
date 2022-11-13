package ucu.edu.ua.demo.flower_decorators;


import ucu.edu.ua.demo.Item;
import ucu.edu.ua.demo.flower.Flower;
import ucu.edu.ua.demo.flower.Tulip;


public class PaperDecorator extends ItemDecorator{
    private Item item;

    public PaperDecorator(Flower flower) {
        super(flower);
        this.item = new Item(flower);
    }
    public double getPrice() {
        return 13 + item.getPrice();
    }

    @Override
    public String getDescription() {
        item.setCharacteristics(item.getCharacteristics() + " in a paper wrap");
        return item.getCharacteristics();
    }

    public static void main(String[] args) {
        Item fl = new Item(new Tulip(8));
        fl.setCharacteristics("gorgeous");
        System.out.println(fl.getCharacteristics());
        System.out.println(fl.getPrice());
        PaperDecorator flb = new PaperDecorator(new Tulip(8));
        System.out.println(flb.getDescription());
        System.out.println(flb.getPrice());
    }
}

