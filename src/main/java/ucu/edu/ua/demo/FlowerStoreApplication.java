package ucu.edu.ua.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@RestController
public class FlowerStoreApplication {
	@Autowired
	private String data;

	public static void main(String[] args) {
		SpringApplication.run(FlowerStoreApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return data;
	}
}
