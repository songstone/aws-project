package com.example.awsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class AwsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsProjectApplication.class, args);
	}

}
