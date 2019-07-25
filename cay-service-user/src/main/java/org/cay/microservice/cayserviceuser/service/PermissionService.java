package org.cay.microservice.cayserviceuser.service;


import org.cay.microservice.common.user.SysMenu;

import java.util.List;

public interface PermissionService {
    List<SysMenu> getPermissionsByRoleId(Integer roleId);
}
