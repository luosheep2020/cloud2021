package com.cloudprovider9001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LuoSheep
 * @date 2021/11/09 19:07
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;


    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable Integer id){
        return "nacos registry,serverPort:"+serverPort+"----id:"+id;
    }
}
