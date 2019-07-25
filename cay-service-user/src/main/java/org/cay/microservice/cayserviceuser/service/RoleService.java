package org.cay.microservice.cayserviceuser.service;


import org.cay.microservice.common.user.SysRole;

import java.util.List;

public interface RoleService {
    List<SysRole> getRoleByUserId(Integer userId);
}
