package com.dragon.springcloud.feign;
/**
 * @Classname FeignClient
 * @Description TODO
 * @Date 2018/12/14 9:32
 * @Created by Administrator
 */

import com.dragon.config.FeignClientInter02Config;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * @Date 2018/12/14 9:32
 * @Classname FeignClient
 */
@FeignClient(name = "awm",url = "http://localhost:10000/",configuration = FeignClientInter02Config.class)
public interface FeignClientInter02 {

    @RequestMapping("/eureka/apps/{servicename}")
    String getServiceInfo(@PathVariable("servicename") String servicename);


}
