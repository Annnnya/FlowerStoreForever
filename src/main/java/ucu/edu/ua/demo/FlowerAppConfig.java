package ucu.edu.ua.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class FlowerAppConfig {
    @Bean
    public String getData() {
        return "flowerstore";
    }
}
