package org.cay.microservice.cayserviceuser.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.cay.microservice.common.user.SysMenu;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface SysMenuMapper {
    @Select(value = "select menu.* from sys_menu menu,sys_privilege p where menu.id=p.menu_id and p.role_id=#{roleId}")
    List<SysMenu> getPermissionsByRoleId(Integer roleId);
}