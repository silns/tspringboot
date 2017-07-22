package com.mt.core.entity.sys;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by shaojia on 2017/7/13.
 */
@Entity
@Table(name = "SYS_USER_ROLE")
public class SysUserRole implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "USER_ROLE_ID")
    private Long userRoleId;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "ROLE_ID")
    private String roleId;

    @Column(name = "CREATE_TIME")
    private String createTime;


    public SysUserRole(String userId, String roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
