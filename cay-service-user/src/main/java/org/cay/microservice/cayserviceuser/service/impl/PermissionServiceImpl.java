package org.cay.microservice.cayserviceuser.service.impl;

import org.cay.microservice.cayserviceuser.mapper.SysMenuMapper;
import org.cay.microservice.cayserviceuser.service.PermissionService;
import org.cay.microservice.common.user.SysMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private SysMenuMapper sysMenuMapper;
    @Override
    public List<SysMenu> getPermissionsByRoleId(Integer roleId) {
        return sysMenuMapper.getPermissionsByRoleId(roleId);
    }
}
