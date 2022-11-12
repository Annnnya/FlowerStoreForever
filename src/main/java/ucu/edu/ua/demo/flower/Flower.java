package ucu.edu.ua.demo.flower;


import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }

    public String detDescription() {return "Flower "+this.flowerType+" price "+this.price;}
}
