package com.bkhatkov.zookeeperbackendservicedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZookeeperBackendServiceDemoController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World! Wooooow!";
    }

}
