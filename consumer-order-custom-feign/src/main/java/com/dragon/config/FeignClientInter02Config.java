package com.dragon.config;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @Date 2018/12/14 15:27
 * @Classname FeignClientInterConfig
 */
@Configuration
public class FeignClientInter02Config {

    /**
     * 用于创建用户名和密码的对象
     * @return
     */
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(){
        return new BasicAuthRequestInterceptor("user","123");
    }

    /**
     * 配置要输出的日志是哪些，必须在 debug 的模式下才可以输出
     */
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }



}
