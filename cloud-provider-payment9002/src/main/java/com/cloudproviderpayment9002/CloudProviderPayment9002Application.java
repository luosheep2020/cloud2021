package com.cloudproviderpayment9002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudProviderPayment9002Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment9002Application.class, args);
    }

}
