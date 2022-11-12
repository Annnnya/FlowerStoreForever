package ucu.edu.ua.demo.flower;

public class Chamomile extends Flower {
    public Chamomile(double price) {
        this.setFlowerType(FlowerType.CHAMOMILE);
        this.setColor(FlowerColor.WHITE);
        this.setPrice(price);
    }
}
