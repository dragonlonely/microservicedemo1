package com.dragon.springcloud;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @Date 2018/12/12 19:30
 * @Classname TestConfig
 */
@Configuration
@ExcludeCommentScan
public class TestConfig {

    @Autowired
    IClientConfig clientConfig;

    /**
     * 创建负载均衡算法的防发
     * @param config
     * @return
     */
    @Bean
    public IRule ribbonRule(IClientConfig config){
        return new RandomRule(); //返回随机的算法
    }
}
