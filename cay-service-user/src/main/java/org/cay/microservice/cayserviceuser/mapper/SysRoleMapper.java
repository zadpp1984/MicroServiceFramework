package org.cay.microservice.cayserviceuser.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.cay.microservice.common.user.SysRole;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface SysRoleMapper {

    @Select(value = "select role.* from sys_role role,sys_user_role ur where role.id=ur.role_id and ur.user_id=#{userId}")
    List<SysRole> getRoleByUserId(Integer userId);
}