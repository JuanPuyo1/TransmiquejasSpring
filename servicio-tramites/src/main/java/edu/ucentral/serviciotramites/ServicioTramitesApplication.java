package edu.ucentral.serviciotramites;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EntityScan({"edu.ucentral.commonpasajero.model","edu.ucentral.serviciopsqr.model", "edu.ucentral.serviciotramites.model"})
@SpringBootApplication
public class ServicioTramitesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioTramitesApplication.class, args);
	}

}
