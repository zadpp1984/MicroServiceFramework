package org.cay.microservice.cayeureka;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@JsonInclude
@SpringBootApplication
@EnableEurekaServer
public class CayEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CayEurekaApplication.class, args);
    }

}
