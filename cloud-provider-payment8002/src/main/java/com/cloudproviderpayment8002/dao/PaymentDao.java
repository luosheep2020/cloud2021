package com.cloudproviderpayment8002.dao;

import com.springcloud.bean.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author LuoSheep
 * @date 2021/5/9
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);
    public  Payment getPaymentById(@Param("id") Long id);
}
