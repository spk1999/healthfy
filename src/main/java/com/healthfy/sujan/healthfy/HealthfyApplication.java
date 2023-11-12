package com.healthfy.sujan.healthfy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class HealthfyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthfyApplication.class, args);
	}

}
