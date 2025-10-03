package com.yan.order.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class XTokenRequestInterceptor implements RequestInterceptor {


    /**
     * 请求拦截器，为每个请求添加X-Token头部
     * @param template 请求模板
     */
    @Override
    public void apply(RequestTemplate template) {
        System.out.println("XTokenRequestInterceptor .............");
        // 生成一个随机UUID作为token值
        String token = UUID.randomUUID().toString();
        // 将X-Token头部添加到请求中
        template.header("X-Token", token);
    }
}
