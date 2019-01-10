package com.dragon.springcloud.feign;
/**
 * @Classname FeignClient
 * @Description TODO
 * @Date 2018/12/14 9:32
 * @Created by Administrator
 */

import com.dragon.springcloud.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Administrator
 * @Date 2018/12/14 9:32
 * @Classname FeignClient
 */
@FeignClient("provider-user")
public interface FeignClientInter {

    @GetMapping("/user/{id}") //C版本的 spring 是不能使用GetMapping 的，必须使用RequestMapping
    //@RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    User getorder(@PathVariable("id") Long id); //必须添加@PathVariable("id")

    @GetMapping("/get-user") //无法访问,提供者那边必须是post方式这边才可以使用，如果非要使用get传递数据，只能以普通方式传递，不能你封装为复杂对象
    User get_user(User user); //如果你传递的是复杂参数，那么feign不管你配置的是什么请求方式，都会以post方式发出去

}
