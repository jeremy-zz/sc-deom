package com.jeremy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Consumer9092Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer9092Application.class, args);
    }

}
