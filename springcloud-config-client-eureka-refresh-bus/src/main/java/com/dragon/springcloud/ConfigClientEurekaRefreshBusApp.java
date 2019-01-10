package com.dragon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @Date 2018/12/17 22:51
 * @Classname ConfigClientEurekaRefreshBusApp
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientEurekaRefreshBusApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientEurekaRefreshBusApp.class,args);
    }
}
