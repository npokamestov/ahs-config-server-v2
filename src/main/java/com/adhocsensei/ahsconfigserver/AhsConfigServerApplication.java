package com.adhocsensei.ahsconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AhsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AhsConfigServerApplication.class, args);
	}

}
