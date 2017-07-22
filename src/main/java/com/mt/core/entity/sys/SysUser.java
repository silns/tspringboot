package com.mt.core.entity.sys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by shaojia on 2017/7/12.
 */
@Entity
@Table(name="SYS_USER")
public class SysUser implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="USER_ID")
    private String userId;

    @Column(name= "PASSWORD")
    private String password;

    @Column(name="CREATE_TIME")
    private String createTime;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "MOBILE")
    private String mobile;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "NICKNAME")
    private String nickname;

    private Integer status;

    @Column(name = "SALT")
    private String salt;

    @Column(name="FAILURE_TIMES")
    private Integer failureTimes;

    public SysUser(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public SysUser(String userId, String password, String createTime, String email, String mobile, String address, String username, Integer status, Integer failureTimes) {
        this.userId = userId;
        this.password = password;
        this.createTime = createTime;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.username = username;
        this.status = status;
        this.failureTimes = failureTimes;
        this.salt = "123456";
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFailureTimes() {
        return failureTimes;
    }

    public void setFailureTimes(Integer failureTimes) {
        this.failureTimes = failureTimes;
    }

    public String getSalt() {
        return this.salt;
    }
}
