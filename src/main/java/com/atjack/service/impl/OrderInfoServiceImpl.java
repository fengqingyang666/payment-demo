package com.atjack.service.impl;


import com.atjack.entity.OrderInfo;
import com.atjack.mapper.OrderInfoMapper;
import com.atjack.service.OrderInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

}
