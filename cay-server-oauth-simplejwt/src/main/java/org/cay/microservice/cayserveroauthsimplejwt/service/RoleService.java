package org.cay.microservice.cayserveroauthsimplejwt.service;

import org.cay.microservice.cayserveroauthsimplejwt.service.impl.RoleServiceFallbackImpl;
import org.cay.microservice.common.Result;
import org.cay.microservice.common.user.SysRole;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "cay-service-user", fallback = RoleServiceFallbackImpl.class)
public interface RoleService {
    @GetMapping("role/getRoleByUserId/{userId}")
    Result<List<SysRole>> getRoleByUserId(@PathVariable("userId") Integer userId);
}
