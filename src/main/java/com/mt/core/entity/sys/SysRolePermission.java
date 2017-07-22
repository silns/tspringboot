package com.mt.core.entity.sys;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by shaojia on 2017/7/13.
 */
@Entity
@Table(name = "SYS_ROLE_PERMISSION")
public class SysRolePermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ROLE_PERMISSION_ID")
    private Long rolePermissionId;

    @Column(name = "ROLE_ID")
    private String roleId;

    @Column(name = "PERMISSION_ID")
    private String permissionId;

    public SysRolePermission(String roleId, String permissionId) {
        this.roleId = roleId;
        this.permissionId = permissionId;
    }

    public Long getRolePermissionId() {
        return rolePermissionId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }
}
