package ucu.edu.ua.demo.flower;

public class Tulip extends Flower {
    public Tulip(double price) {
        this.setFlowerType(FlowerType.TULIP);
        this.setColor(FlowerColor.PINK);
        this.setPrice(price);
    }
}
