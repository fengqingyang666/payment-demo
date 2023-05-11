package com.atjack.controller;

import com.atjack.config.WxPayConfig;
import com.atjack.vo.R;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName TestController
 * @Description
 * @Author YangJun
 * @Date 2023/5/11 15:45
 * @Version 1.0
 */
@Api(tags = "测试控制器")
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Resource
    private WxPayConfig wxPayConfig;

    @GetMapping("/get-wx-pay-config")
    public R getWxPayConfig() {
        String mchId = wxPayConfig.getMchId();
        return R.ok().data("mchId", mchId);
    }

}
