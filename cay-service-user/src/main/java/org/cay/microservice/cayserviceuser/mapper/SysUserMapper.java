package org.cay.microservice.cayserviceuser.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.cay.microservice.common.user.SysUser;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysUserMapper {

    @Select(value = "select * from sys_user where username=#{username}")
    SysUser getUserByUserName(String username);
}