package com.cloudconfignacosclient3377;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConfigNacosClient3377Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigNacosClient3377Application.class, args);
    }

}
