package ucu.edu.ua.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ucu.edu.ua.demo.flower.Rose;
import ucu.edu.ua.demo.flower_decorators.BasketDecorator;
import ucu.edu.ua.demo.flower_decorators.PaperDecorator;
import ucu.edu.ua.demo.flower_decorators.RibbonDecorator;


public class DecoratorTests {
    @Test
    public void testBasketDecorator() {
        BasketDecorator item = new BasketDecorator(new Rose(5));
        Assertions.assertEquals("Flower ROSE price 5.0 in the basket", item.getDescription());
        Assertions.assertEquals(item.getPrice(), 9);
    }

    @Test
    public void testPaperDecorator() {
        PaperDecorator item = new PaperDecorator(new Rose(5));
        Assertions.assertEquals("Flower ROSE price 5.0 in a paper wrap", item.getDescription());
        Assertions.assertEquals(item.getPrice(), 18);
    }

    @Test
    public void testRibbonDecorator() {
        RibbonDecorator item = new RibbonDecorator(new Rose(5));
        Assertions.assertEquals("Flower ROSE price 5.0 with ribbon", item.getDescription());
        Assertions.assertEquals(item.getPrice(), 45);
    }
}
