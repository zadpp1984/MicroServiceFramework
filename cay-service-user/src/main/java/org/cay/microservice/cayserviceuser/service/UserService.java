package org.cay.microservice.cayserviceuser.service;


import org.cay.microservice.common.user.SysUser;

public interface UserService {
    SysUser findByUsername(String username);
}
