package com.bkhatkov.zookeeperbackendservicedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.zookeeper.serviceregistry.ServiceInstanceRegistration;
import org.springframework.cloud.zookeeper.serviceregistry.ZookeeperRegistration;
import org.springframework.cloud.zookeeper.serviceregistry.ZookeeperServiceRegistry;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ZookeeperBackendServiceDemoApplication {

    @Autowired
    private ZookeeperServiceRegistry serviceRegistry;

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperBackendServiceDemoApplication.class, args);
    }

//    @PostConstruct
    private void register() {
        System.out.println("GG: " + env.getProperty("server.port"));
        ZookeeperRegistration registration = ServiceInstanceRegistration.builder()
                .defaultUriSpec()
                .address(env.getProperty("server.host"))
                .port(Integer.valueOf(env.getProperty("server.port")))
                .name("/zookeeper-backend-service-demo/v1")
                .build();
        this.serviceRegistry.register(registration);
    }

}
