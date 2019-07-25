package org.cay.microservice.common.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SysRole implements Serializable {
    private Integer id;

    private String name;

    private String value;

    private String tips;

    private Date create_time;

    private Date update_time;

    private Integer status;
}