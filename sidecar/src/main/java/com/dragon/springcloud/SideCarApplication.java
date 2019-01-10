package com.dragon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

/**
 * @author Administrator
 * @Date 2018/12/15 22:18
 * @Classname SideCarApplication
 */
@SpringBootApplication
@EnableSidecar
public class SideCarApplication {
    public static void main(String[] args) {
        SpringApplication.run(SideCarApplication.class,args);
    }
}
