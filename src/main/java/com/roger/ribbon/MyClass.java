package com.roger.ribbon;

import com.roger.client.ClientConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Component;

import java.net.URI;

@Component
@RibbonClient(name = "test", configuration = ClientConfiguration.class)
public class MyClass {
    @Autowired
    private LoadBalancerClient loadBalancer;

    public String doStuff() {
        ServiceInstance instance = loadBalancer.choose("test");
        System.out.println(instance.getHost());
        return instance.getHost();
    }
}
