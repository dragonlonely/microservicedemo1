package com.dragon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Administrator
 * @Date 2018/12/15 14:26
 * @Classname ZuulApplication
 */
@SpringBootApplication
@EnableZuulProxy //启用 zuul，自带熔断和自动注册到eureka，注意需要导入 eureka 的client 依赖
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
