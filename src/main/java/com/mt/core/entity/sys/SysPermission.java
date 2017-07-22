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
@Table(name = "SYS_PERMISSION")
public class SysPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "PERMISSION_ID")
    private String permissionId;

    /**
     * belong system
     */
    @Column(name = "SYSTEM_ID")
    private String systemId;

    /**
     * parent id
     */
    @Column(name = "PID")
    private String pid;

    /**
     * permission name
     */
    @Column(name = "PERMISSION_NAME")
    private String permissionName;

    /**
     * permission value
     */
    @Column(name = "PERMISSION_VALUE")
    private String permissionValue;

    /**
     * 1:dir 2:menu 3:button
     */
    @Column(name = "TYPE")
    private Integer type;

    @Column(name = "URI")
    private String uri;

    @Column(name = "ICON")
    private String icon;

    @Column(name = "CREATE_TIME")
    private String createTime;

    @Column(name = "ORDER_NUM")
    private Long orderNum;



}
