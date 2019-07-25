package org.cay.microservice.cayserviceuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("org.cay.microservice.cayserviceuser.mapper")
public class CayServiceUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CayServiceUserApplication.class, args);
    }

}
