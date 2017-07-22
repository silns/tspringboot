package com.mt.core.repository.sys.impl;

import com.mt.core.dao.BaseRepositoryImpl;
import com.mt.core.entity.sys.SysUser;
import com.mt.core.repository.sys.SysUserRepositoryCustom;


/**
 * Created by shaojia on 2017/7/13.
 */

public class SysUserRepositoryImpl extends BaseRepositoryImpl<SysUser, String> implements SysUserRepositoryCustom {

    public void doSomething() {
        System.out.println("do something");
    }
}

