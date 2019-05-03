package com.service.main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = "com.service")
public class Microservice1 {
	public static void main(String[] args) {
		SpringApplication.run(Microservice1.class, args);
	}
}
