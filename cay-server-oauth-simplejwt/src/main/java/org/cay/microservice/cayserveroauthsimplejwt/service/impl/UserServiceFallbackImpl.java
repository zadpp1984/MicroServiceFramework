package org.cay.microservice.cayserveroauthsimplejwt.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.cay.microservice.cayserveroauthsimplejwt.service.UserService;
import org.cay.microservice.common.Result;
import org.cay.microservice.common.user.SysUser;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Slf4j
public class UserServiceFallbackImpl implements UserService {
    @Override
    public Result<SysUser> findByUsername(String username) {
        log.info("调用{}失败","findByUsername");
        return Result.failure(100,"调用findByUsername接口失败");
    }
}
