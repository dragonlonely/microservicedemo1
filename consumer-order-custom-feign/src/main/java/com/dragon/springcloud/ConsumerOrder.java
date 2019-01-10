package com.dragon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author Administrator
 * @Date 2018/12/12 14:51
 * @Classname ConsumerOrder
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ConsumerOrder {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrder.class,args);
    }
}
