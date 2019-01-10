package com.dragon.springcloud.controller;

import com.dragon.springcloud.pojo.User;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/order/{id}")
    public User getOrder(@PathVariable Long id){
        //访问提供者获取数据
        //通过访问rest 获取到json 数据，然后转化为user 对象
        //User user = restTemplate.getForObject(url+ id, User.class);
//        InstanceInfo instance=eurekaClient.getNextServerFromEureka("PROVIDER-USER", false);
//        String homePageUrl = instance.getHomePageUrl();
        User user = restTemplate.getForObject("http://PROVIDER-USER/user/" + id, User.class);
        return user;
    }

    @GetMapping("/test")
    public String test(){
        //查找对应服务的实力，会通过负载均衡的算法返回一个
        ServiceInstance serviceInstance1 = loadBalancerClient.choose("PROVIDER-USER");
        System.out.println("111-->"+serviceInstance1.getServiceId()+"  222-->"+serviceInstance1.getHost()+"  333--->"+serviceInstance1.getPort());

        ServiceInstance serviceInstance2 = loadBalancerClient.choose("PROVIDER-USER1");
        System.out.println("aaa-->"+serviceInstance2.getServiceId()+"  bbb-->"+serviceInstance2.getHost()+"  ccc--->"+serviceInstance2.getPort());

        return "ok";
    }

}
