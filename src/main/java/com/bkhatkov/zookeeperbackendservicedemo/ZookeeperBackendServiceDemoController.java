package com.bkhatkov.zookeeperbackendservicedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZookeeperBackendServiceDemoController {

    @Autowired
    Environment environment;

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World from: " + environment.getProperty("server.port");
    }

}
