package com.cloud.sd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: shiding
 * @data: 2022/8/9 10:23
 **/
@SpringBootApplication
@EnableEurekaServer
public class SdEurekaServerApp8761 {

    public static void main(String[] args) {
        SpringApplication.run(SdEurekaServerApp8761.class, args);
    }
}
