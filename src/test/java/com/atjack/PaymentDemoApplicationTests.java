package com.atjack;

import com.atjack.config.WxPayConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.security.PrivateKey;

/**
 * @ClassName PaymentDemoApplicationTests
 * @Description
 * @Author YangJun
 * @Date 2023/5/11 16:06
 * @Version 1.0
 */
@SpringBootTest
public class PaymentDemoApplicationTests {

    @Resource
    private WxPayConfig wxPayConfig;

    @Test
    public void testGetPrivateKey() {

        String privateKeyPath = wxPayConfig.getPrivateKeyPath();
        PrivateKey privateKey = wxPayConfig.getPrivateKey(privateKeyPath);

        System.out.println(privateKey);
    }
}
