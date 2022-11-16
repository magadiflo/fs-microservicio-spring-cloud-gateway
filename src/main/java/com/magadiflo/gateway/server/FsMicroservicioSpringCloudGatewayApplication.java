package com.magadiflo.gateway.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FsMicroservicioSpringCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FsMicroservicioSpringCloudGatewayApplication.class, args);
	}

}
