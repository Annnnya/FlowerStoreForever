package ucu.edu.ua.demo.flower;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Entity
@Table
public class Flower {
    @Id @GeneratedValue @Getter @Setter
    private int id;
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
