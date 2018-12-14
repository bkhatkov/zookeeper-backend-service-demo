package com.bkhatkov.zookeeperbackendservicedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.cloud.zookeeper.serviceregistry.ZookeeperRegistration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZookeeperBackendServiceDemoController {

    @Autowired
    private ZookeeperRegistration registration;

    @Autowired
    Environment environment;

    @GetMapping("/")
    public String index() {
        return "Hello from Zookeeper Demo Backend Service " + registration.getMetadata();
    }

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World from: " + environment.getProperty("server.port");
    }

}
