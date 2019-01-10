package com.dragon.springcloud.controller;

import com.dragon.springcloud.pojo.User;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Administrator
 * @Date 2018/12/12 14:44
 * @Classname OrderController
 */
@RestController
public class OrderController {

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private RestTemplate restTemplate;
    @Value("${user.url}")
    private String url;
    //private String url="http://localhost:7900/user/";

    @GetMapping("/order/{id}")
    public User getOrder(@PathVariable Long id){
        //访问提供者获取数据
        //通过访问rest 获取到json 数据，然后转化为user 对象
        InstanceInfo instance=eurekaClient.getNextServerFromEureka("PROVIDER-USER", false);
        String homePageUrl = instance.getHomePageUrl();
        User user = restTemplate.getForObject(homePageUrl+"/user/" + id, User.class);
        return user;
    }

}
