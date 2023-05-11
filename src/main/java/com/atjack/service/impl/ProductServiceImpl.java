package com.atjack.service.impl;


import com.atjack.entity.Product;
import com.atjack.mapper.ProductMapper;
import com.atjack.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
