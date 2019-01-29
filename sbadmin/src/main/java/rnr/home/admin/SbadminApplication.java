package rnr.home.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
@SpringBootConfiguration
public class SbadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbadminApplication.class, args);
	}

}

