package com.levonk.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Config {

	public static void main(String[] args) {
		SpringApplication.run(Config.class, args);
	}
}
