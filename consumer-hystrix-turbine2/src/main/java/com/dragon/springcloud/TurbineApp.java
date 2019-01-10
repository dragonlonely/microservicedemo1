package com.dragon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Administrator
 * @Date 2018/12/14 22:36
 * @Classname TurbineApp
 */
@SpringBootApplication
@EnableEurekaClient
@EnableTurbine
public class TurbineApp {

    @Bean //相当于 xml 中的 bean 标签,主要是用于调用当前方法获取到指定对象
    public RestTemplate getTemp(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(TurbineApp.class,args);
    }
}
