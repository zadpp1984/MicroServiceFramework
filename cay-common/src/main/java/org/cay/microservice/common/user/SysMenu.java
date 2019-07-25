package org.cay.microservice.common.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SysMenu implements Serializable {

    private Integer id;

    /**
     * 菜单编码
     */
    private String code;

    /**
     * 菜单父编码
     */
    private String p_code;

    /**
     * 父菜单ID
     */
    private String p_id;

    /**
     * 名称
     */
    private String name;

    /**
     * 请求地址
     */
    private String url;

    /**
     * 是否是菜单
     */
    private Integer is_menu;

    /**
     * 菜单层级
     */
    private Integer level;

    /**
     * 菜单排序
     */
    private Integer sort;

    private Integer status;

    private String icon;

    private Date create_time;

    private Date update_time;

}