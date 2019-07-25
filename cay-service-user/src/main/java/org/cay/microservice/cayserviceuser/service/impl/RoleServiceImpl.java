package org.cay.microservice.cayserviceuser.service.impl;

import org.cay.microservice.cayserviceuser.mapper.SysRoleMapper;
import org.cay.microservice.cayserviceuser.service.RoleService;
import org.cay.microservice.common.user.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysRole> getRoleByUserId(Integer userId) {
        return sysRoleMapper.getRoleByUserId(userId);
    }
}
