package com.example.gateway.rateLimiter;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/**
 * @ClassName RateLimiterConfig
 * @Description TODO
 * @Author jincheng
 * @Date 2022/9/30 13:31
 * @Version 1.0
 **/
@Component
public class RateLimiterConfig {
    @Bean
    KeyResolver userKeyResolver(){
        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("user"));
    }
}
