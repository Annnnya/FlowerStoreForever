package ucu.edu.ua.demo.flower;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(new Chamomile(15), new Tulip(10), new Rose(20));
    }
}
