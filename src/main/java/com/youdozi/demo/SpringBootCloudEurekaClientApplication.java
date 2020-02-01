package com.youdozi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootCloudEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudEurekaClientApplication.class, args);
	}

}
