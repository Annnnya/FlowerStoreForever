package ucu.edu.ua.demo.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
public class FlowerController {
    private final FlowerService flowerService;
    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }
    @PostMapping("/add_flower")
    public void addFlower(@RequestBody Flower flower) {
        flowerService.addFlower(flower);
    }
}
