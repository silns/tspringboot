package com.mt.core.entity.sys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by shaojia on 2017/7/13.
 */
@Entity
@Table(name="SYS_ROLE")
public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ROLE_ID")
    private String roleId;

    @Column(name = "ROLE_NAME")
    private String roleName;

    private Integer status;

    private String description;

    public SysRole(String roleId, String roleName) {
        this(roleId, roleName, 0, "");
    }

    public SysRole(String roleId, String roleName, Integer status, String description) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.status = status;
        this.description = description;
    }

    public String getRoleId() {
        return roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
