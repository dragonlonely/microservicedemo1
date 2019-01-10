package com.dragon.springcloud.feign;
/**
 * @Classname FeignClient
 * @Description TODO
 * @Date 2018/12/14 9:32
 * @Created by Administrator
 */

import com.dragon.config.FeignClientInterConfig;
import com.dragon.springcloud.pojo.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author Administrator
 * @Date 2018/12/14 9:32
 * @Classname FeignClient
 */
@FeignClient(name = "provider-user",configuration = FeignClientInterConfig.class)
public interface FeignClientInter {

    //@GetMapping("/user/{id}") //C版本的 spring 是不能使用GetMapping 的，必须使用RequestMapping
    //@RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @RequestLine("GET /user/{id}") //这是一个组合注解,第一个是请求方式，第二个是请求参数,用空格分割
    User getorder(@Param("id") Long id); //注意使用RequestLine的时候，必须使用Param注解

    @RequestLine("GET /get-user")
    User get_user(User user); //如果你传递的是复杂参数，那么feign不管你配置的是什么请求方式，都会以post方式发出去

}
