package com.bkhatkov.zookeeperbackendservicedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ZookeeperBackendServiceDemoApplication {

    @Autowired
    private Registration registration;

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperBackendServiceDemoApplication.class, args);


    }
}
