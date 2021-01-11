package com.ibcs.resilience4J;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Resilience4JApplication {

	public static void main(String[] args) {
		SpringApplication.run(Resilience4JApplication.class, args);
	}

}
