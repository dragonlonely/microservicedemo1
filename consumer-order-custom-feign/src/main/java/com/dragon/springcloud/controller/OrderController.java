package com.dragon.springcloud.controller;

import com.dragon.springcloud.feign.FeignClientInter;
import com.dragon.springcloud.feign.FeignClientInter02;
import com.dragon.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @Date 2018/12/12 14:44
 * @Classname OrderController
 */
@RestController
public class OrderController {

    @Autowired
    private FeignClientInter feignClientInter;

    @Autowired
    private FeignClientInter02 feignClientInter02;

    @GetMapping("/order/{id}")
    public User getOrder(@PathVariable("id") Long id) {
        User order = feignClientInter.getorder(id);
        return order;
    }

    @GetMapping("/get-user")
    public User getUser(User user) {
        User order = feignClientInter.get_user(user);
        return order;
    }

    @RequestMapping("/serviceinfo/{name}")
    public String getServiceInfo(@PathVariable String name){
        String serviceInfo = feignClientInter02.getServiceInfo(name);
        return serviceInfo;
    }

}
