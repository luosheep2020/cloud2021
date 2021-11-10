package com.cloudproviderpayment8002.service.impl;

import com.cloudproviderpayment8002.dao.PaymentDao;
import com.cloudproviderpayment8002.service.PaymentService;
import com.springcloud.bean.Payment;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LuoSheep
 * @date 2021/5/9
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
