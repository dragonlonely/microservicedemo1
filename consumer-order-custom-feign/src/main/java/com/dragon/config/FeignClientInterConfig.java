package com.dragon.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @Date 2018/12/14 15:27
 * @Classname FeignClientInterConfig
 */
@Configuration
public class FeignClientInterConfig {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
}
