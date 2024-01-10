package io.whatap.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsaServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaServiceDiscoveryApplication.class, args);
	}

}
