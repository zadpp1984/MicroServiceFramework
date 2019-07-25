package org.cay.microservice.cayserveroauthsimplejwt.service;

import org.cay.microservice.cayserveroauthsimplejwt.service.impl.UserServiceFallbackImpl;
import org.cay.microservice.common.Result;
import org.cay.microservice.common.user.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cay-service-user", fallback = UserServiceFallbackImpl.class)
public interface UserService {
    @GetMapping("user/findByUsername/{username}")
    Result<SysUser> findByUsername(@PathVariable("username") String username);
}
