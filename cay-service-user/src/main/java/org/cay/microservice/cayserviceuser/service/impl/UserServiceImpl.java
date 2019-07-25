package org.cay.microservice.cayserviceuser.service.impl;


import org.cay.microservice.cayserviceuser.mapper.SysUserMapper;
import org.cay.microservice.cayserviceuser.service.UserService;
import org.cay.microservice.common.user.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findByUsername(String username) {
        return sysUserMapper.getUserByUserName(username);
    }
}
