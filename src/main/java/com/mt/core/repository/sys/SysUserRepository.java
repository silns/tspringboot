package com.mt.core.repository.sys;

import com.mt.core.dao.BaseRepository;
import com.mt.core.entity.sys.SysUser;

/**
 * Created by shaojia on 2017/7/13.
 */

public interface SysUserRepository extends BaseRepository<SysUser, String>,SysUserRepositoryCustom {

    public void doSomething();

    public SysUser findByUserame(String username);


}

