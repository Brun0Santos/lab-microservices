package io.github.bruno.msclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class MsClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsClientApplication.class, args);
	}

}
