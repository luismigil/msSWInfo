package com.info.sw.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsSwInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSwInfoApplication.class, args);
	}

}
