package org.cay.microservice.cayserveroauthsimplejwt.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.cay.microservice.cayserveroauthsimplejwt.service.RoleService;
import org.cay.microservice.common.Result;
import org.cay.microservice.common.user.SysRole;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Slf4j
public class RoleServiceFallbackImpl implements RoleService {
    @Override
    public Result<List<SysRole>> getRoleByUserId(Integer userId) {
        log.info("调用{}失败","getRoleByUserId");
        return Result.failure(100,"调用getRoleByUserId失败");
    }
}
