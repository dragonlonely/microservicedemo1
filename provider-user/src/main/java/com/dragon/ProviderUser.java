package com.dragon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 * @Date 2018/12/12 14:36
 * @Classname App
 * 主程序
 */
@SpringBootApplication
@EnableEurekaClient //启用eureka客户端
public class ProviderUser {
    public static void main(String[] args)  {
        SpringApplication.run(ProviderUser.class);
    }
}
