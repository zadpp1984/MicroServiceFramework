package org.cay.microservice.cayserveroauthsimplejwt.service;


import org.cay.microservice.cayserveroauthsimplejwt.service.impl.PermissionServiceFallbackImpl;
import org.cay.microservice.common.user.SysMenu;
import org.cay.microservice.common.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "cay-service-user",fallback = PermissionServiceFallbackImpl.class)
public interface PermissionService {
    @GetMapping("permission/getRolePermission/{roleId}")
    Result<List<SysMenu>> getRolePermission(@PathVariable("roleId") Integer roleId);
}
