package com.dragon.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @Date 2018/12/17 22:50
 * @Classname ConfigClientEurekaRefreshBusController
 */
@RestController
@RefreshScope
public class ConfigClientEurekaRefreshBusController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/profile")
    public String getProfile(){
        return profile;
    }
}
