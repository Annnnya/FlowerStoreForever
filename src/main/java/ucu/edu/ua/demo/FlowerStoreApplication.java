package ucu.edu.ua.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FlowerStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowerStoreApplication.class, args);
	}

}
