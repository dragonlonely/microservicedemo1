package com.dragon.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @Date 2018/12/17 22:10
 * @Classname ConfigClientEurekaRefreshController
 */
@RestController
@RefreshScope  //自动刷新,当数据发生变化时(变化指的是它发现数据发生了变化)
public class ConfigClientEurekaRefreshController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/profile")
    public String getProfile(){
        return profile;
    }
}
