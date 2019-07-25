package org.cay.microservice.cayserveroauthsimplejwt.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.cay.microservice.cayserveroauthsimplejwt.service.PermissionService;
import org.cay.microservice.common.user.SysMenu;
import org.cay.microservice.common.Result;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Component
public class PermissionServiceFallbackImpl implements PermissionService {
    @Override
    public Result<List<SysMenu>> getRolePermission(Integer roleId) {
        log.info("调用{}失败", "getRolePermission");
        return Result.failure(100, "调用getRolePermission失败");
    }
}
