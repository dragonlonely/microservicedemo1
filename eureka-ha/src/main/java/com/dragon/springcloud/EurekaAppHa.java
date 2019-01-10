package com.dragon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //将当前项目标记为eurekaserver
public class EurekaAppHa {
    public static void main(String[] args) {
        SpringApplication.run(EurekaAppHa.class,args);
    }
}
