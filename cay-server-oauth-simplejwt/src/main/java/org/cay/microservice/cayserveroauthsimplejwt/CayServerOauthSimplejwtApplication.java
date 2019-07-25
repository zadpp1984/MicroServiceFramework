package org.cay.microservice.cayserveroauthsimplejwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableDiscoveryClient
public class CayServerOauthSimplejwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(CayServerOauthSimplejwtApplication.class, args);
    }

}
