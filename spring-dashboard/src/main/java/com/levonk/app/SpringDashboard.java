package com.levonk.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class SpringDashboard {

	public static void main(String[] args) {
		SpringApplication.run(SpringDashboard.class, args);
	}
}
