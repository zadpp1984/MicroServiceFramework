package org.cay.microservice.cayserviceuser.controller;

import org.cay.microservice.cayserviceuser.service.UserService;
import org.cay.microservice.common.Result;
import org.cay.microservice.common.user.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("findByUsername/{username}")
    public Result findByUsername(@PathVariable("username") String username){
        SysUser user = userService.findByUsername(username);
        if (user == null){
            return Result.failure(100,"用户不存在");
        }
        return Result.ok().setData(user);
    }
}
