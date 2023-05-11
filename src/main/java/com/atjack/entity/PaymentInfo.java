package com.atjack.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_payment_info")
public class PaymentInfo extends BaseEntity{

    private String orderNo;

    private String transactionId;

    private String paymentType;

    private String tradeType;

    private String tradeStatus;

    private Integer payerTotal;

    private String content;
}
