package com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(scanBasePackages = { "com.service" })
@ServletComponentScan
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

}
