package com.springcloud.service;

import com.springcloud.bean.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author LuoSheep
 * @date 2021/5/9
 */

public interface PaymentService {
    public int create(Payment payment);
    public  Payment getPaymentById(@Param("id") Long id);
}
