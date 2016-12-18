package com.levonk.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaServer
@SpringBootApplication
public class Discovery {

	public static void main(String[] args) {
		SpringApplication.run(Discovery.class, args);
	}
}
