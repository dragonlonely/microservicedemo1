package com.dragon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Administrator
 * @Date 2018/12/17 11:12
 * @Classname ConfigServerAuthApp
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerAuthApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerAuthApp.class,args);
    }
}
