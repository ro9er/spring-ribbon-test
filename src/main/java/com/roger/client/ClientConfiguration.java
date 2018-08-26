package com.roger.client;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import com.sun.org.apache.bcel.internal.generic.ILOAD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfiguration {

    @Bean
    public IRule rule(){
        return new WeightedResponseTimeRule();
    }
}
