package edu.ucentral.serviciopsqr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EntityScan({"edu.ucentral.commonpasajero.model","edu.ucentral.serviciopsqr.model"})
@SpringBootApplication
public class ServicioPsqrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioPsqrApplication.class, args);
	}

}
