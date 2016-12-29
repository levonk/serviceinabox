package com.levonk.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import be.ordina.msdashboard.EnableMicroservicesDashboardServer;

@SpringBootApplication
@EnableMicroservicesDashboardServer
public class OrdinaMicroservicesDashboard {

	public static void main(String[] args) {
		SpringApplication.run(OrdinaMicroservicesDashboard.class, args);
	}
}
