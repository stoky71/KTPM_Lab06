package com.example.KTPM_Lab05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages = " com.*")
@Configuration
@ComponentScan("com.example.KTPM_Lab05")
public class KtpmLab05Application {

	public static void main(String[] args) {
		SpringApplication.run(KtpmLab05Application.class, args);
	}

}
