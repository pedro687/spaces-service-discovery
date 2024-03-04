package com.spaces.spacesserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpacesServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpacesServiceRegistryApplication.class, args);
	}

}
