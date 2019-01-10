package com.dragon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @Date 2018/12/17 11:46
 * @Classname ConfigClientEurekaApp
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientEurekaApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientEurekaApp.class,args);
    }
}
