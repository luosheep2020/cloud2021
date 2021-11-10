package com.cloudconsumerfeignhystrixorder80.controller;

import com.cloudconsumerfeignhystrixorder80.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LuoSheep
 * @date 2021/10/09 21:46
 */
@RestController
@Slf4j
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable(value = "id") Integer id){
       return  paymentHystrixService.paymentInfo_ok(id);
    };

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable(value = "id") Integer id){
        return paymentHystrixService.paymentInfo_TimeOut(id);
    };
}
