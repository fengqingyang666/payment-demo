package com.atjack.service.impl;


import com.atjack.entity.PaymentInfo;
import com.atjack.mapper.PaymentInfoMapper;
import com.atjack.service.PaymentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo> implements PaymentInfoService {

}
