package ucu.edu.ua.demo.flower;

public class Rose extends Flower {
    public Rose(double price) {
        this.setFlowerType(FlowerType.ROSE);
        this.setColor(FlowerColor.RED);
        this.setPrice(price);
    }
}
