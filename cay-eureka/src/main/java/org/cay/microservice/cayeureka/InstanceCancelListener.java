package org.cay.microservice.cayeureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class InstanceCancelListener implements ApplicationListener<EurekaInstanceCanceledEvent> {
    @Override
    public void onApplicationEvent(EurekaInstanceCanceledEvent eurekaInstanceCanceledEvent) {

        log.info("服务:{}挂了",eurekaInstanceCanceledEvent.getAppName());
    }
}
