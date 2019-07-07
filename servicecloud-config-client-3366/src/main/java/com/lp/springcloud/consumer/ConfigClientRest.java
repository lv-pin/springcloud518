package com.lp.springcloud.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = "/")
//@RefreshScope
public class ConfigClientRest {
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;
    @Value("${server.port}")
    private String port;
    @RequestMapping(value = "/config")
    public String getConfig(){
        System.out.println(applicationName+"#"+eurekaServers+"#"+port);
        return applicationName+"#"+eurekaServers+"#"+port;
    }

}