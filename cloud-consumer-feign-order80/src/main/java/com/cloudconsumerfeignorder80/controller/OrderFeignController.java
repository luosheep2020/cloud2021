package com.cloudconsumerfeignorder80.controller;

import com.cloudconsumerfeignorder80.service.PaymentFeignService;
import com.springcloud.bean.CommonResult;
import com.springcloud.bean.Payment;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LuoSheep
 * @date 2021/5/11
 */
@RestController
@Log4j2
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;


    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
}
