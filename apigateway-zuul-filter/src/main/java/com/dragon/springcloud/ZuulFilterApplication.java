package com.dragon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Administrator
 * @Date 2018/12/16 15:31
 * @Classname ZuulFilterApplication
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulFilterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulFilterApplication.class,args);
    }
}
