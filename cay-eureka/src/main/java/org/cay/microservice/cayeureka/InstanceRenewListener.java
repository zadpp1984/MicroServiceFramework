package org.cay.microservice.cayeureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class InstanceRenewListener implements ApplicationListener<EurekaInstanceRenewedEvent> {
    @Override
    public void onApplicationEvent(EurekaInstanceRenewedEvent eurekaInstanceRenewedEvent) {
        log.info("心跳检测服务：{}" ,eurekaInstanceRenewedEvent.getInstanceInfo().getAppName());
    }
}
