package com.cloudproviderpayment8002.controller;

import com.cloudproviderpayment8002.service.PaymentService;
import com.springcloud.bean.CommonResult;
import com.springcloud.bean.Payment;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author LuoSheep
 * @date 2021/5/9
 */

@RestController
@Log4j2
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result= paymentService.create(payment);
        log.info("*****插入结果"+result);
        if (result>0) {
            return new CommonResult(200,"插入成功 Port:"+serverPort,result);
        }else {
            return new CommonResult(444,"插入失败",null);
        }
    }

    @GetMapping (value = "/payment/get/{id}")
    public CommonResult  getPaymentById(@PathVariable("id") Long id){
       Payment payment= paymentService.getPaymentById(id);
        log.info("*****插入结果"+payment);
        if (payment!=null) {
            return new CommonResult(200," :"+serverPort,payment);
        }else {
            return new CommonResult(444,"查询失败",null);
        }
    }
}
