package com.example.gateway.loadBalance;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.Server;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName MyRule
 * @Description TODO
 * @Author jincheng
 * @Date 2022/9/29 17:22
 * @Version 1.0
 **/
@Component
public class MyRule extends AbstractLoadBalancerRule {
    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object o) {
        System.out.println("自定义负载均衡策略");
        List<Server> list = this.getLoadBalancer().getReachableServers();
        System.out.println(list);
        double random = Math.random();
        //1-10
        int rand = (int) (random * 10 + 1);
        return rand < 8 ? list.get(0) : list.get(list.size() - 1);
    }
}
