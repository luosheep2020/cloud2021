package com.cloudconsumerorder80.controller;

import com.cloudconsumerorder80.bean.CommonResult;
import com.cloudconsumerorder80.bean.Payment;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author LuoSheep
 * @date 2021/5/10
 */

@RestController
@Log4j2
public class OrderController {
    public static  final String BASE_URL="http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(BASE_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
       return restTemplate.getForObject(BASE_URL+"/payment/get/"+id,CommonResult.class);
    }
}
