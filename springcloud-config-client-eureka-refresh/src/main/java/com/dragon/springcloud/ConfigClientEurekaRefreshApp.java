package com.dragon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @Date 2018/12/17 22:12
 * @Classname ConfigClientEurekaRefreshApp
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientEurekaRefreshApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientEurekaRefreshApp.class,args);
    }
}
