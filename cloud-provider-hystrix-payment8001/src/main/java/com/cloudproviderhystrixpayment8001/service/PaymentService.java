package com.cloudproviderhystrixpayment8001.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author LuoSheep
 * @date 2021/5/11
 */
@Service
public class PaymentService {

    public String paymentInfo_ok(Integer id){
        return "线程池:"+Thread.currentThread().getName()+"PaymentInfo_ok: id"+id+"O(∩_∩)O哈哈~";
    };


    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")
    })
    public String paymentInfo_Timeout(Integer id){
        try{
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池:"+Thread.currentThread().getName()+"PaymentInfo_Timeout: id"+id+"O(∩_∩)O哈哈~";
    };


    public String paymentInfo_TimeoutHandler(Integer id){
        return "线程池:"+Thread.currentThread().getName()+"PaymentInfo_Timeout: id"+id+"o(╥﹏╥)o";
    }
}

