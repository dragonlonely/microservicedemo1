package com.dragon.springcloud;

import com.netflix.zuul.ZuulFilter;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @Date 2018/12/16 15:32
 * @Classname MyPreZuulFilter
 */
@Component
public class MyPreZuulFilter extends ZuulFilter {

    /**
     * 类型包含 pre post route error
     * pre 代表在路由代理之前执行
     * route 代表代理的时候执行
     * error 代表出现错误的时候执行
     * post 代表在route 或者是 error 执行完成后执行
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * filter是一个链式调用的，一个filter会调用 下面的一个filter，那如何知道顺序
     * javaee中是根据filter的配置先后顺序来决定
     * zuul是根据order决定，越小的，越先执行
     * @return
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 是否使用这个过滤器
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("过滤器执行了...");
        return null;
    }
}
