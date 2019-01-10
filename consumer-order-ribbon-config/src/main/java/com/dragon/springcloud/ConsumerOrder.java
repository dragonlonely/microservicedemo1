package com.dragon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

/**
 * @author Administrator
 * @Date 2018/12/12 14:51
 * @Classname ConsumerOrder
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "PROVIDER-USER",configuration = TestConfig.class) //启用 ribbon 并对 PROVIDER-USER 进行负载均衡
@ComponentScan(excludeFilters ={@ComponentScan.Filter(type = FilterType.ANNOTATION,value =ExcludeCommentScan.class )} )
public class ConsumerOrder {

    @Bean
    public RestTemplate getTemp(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrder.class);
    }
}
