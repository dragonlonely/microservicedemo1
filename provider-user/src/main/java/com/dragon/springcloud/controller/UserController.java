package com.dragon.springcloud.controller;

import com.dragon.springcloud.pojo.User;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private EurekaClient eurekaClient;


    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        return new User(id);
    }

    @GetMapping("/eurekainfo")
    public String info(){
        InstanceInfo instance=eurekaClient.getNextServerFromEureka("PROVIDER-USER", false);
        return instance.getHomePageUrl();
    }

    @GetMapping("/get-user")
    public User getUser(User user){
        return user; //相当于我们传递一个复杂参数会被封装成User 对象，然后我们将封装的对象返回，也就是你传递什么我返回什么
    }

}
