package com.yan.order.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class OrderConfig {


    /**
     * 配置Feign客户端的重试器
     * 默认情况下，Feign会使用Retryer.Default进行重试
     * 重试机制可以在服务调用失败时自动重试，提高系统的容错能力
     * @return Retryer实例
     */
    @Bean
    public Retryer retryer() {
        // 使用默认的重试策略，初始间隔为100ms，最大重试次数为5次
        return new Retryer.Default();
    }

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }


    @LoadBalanced//注解式负载均衡
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
