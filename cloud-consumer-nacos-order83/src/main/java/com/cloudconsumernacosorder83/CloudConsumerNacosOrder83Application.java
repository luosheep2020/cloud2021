package com.cloudconsumernacosorder83;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudConsumerNacosOrder83Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerNacosOrder83Application.class, args);
    }

}
