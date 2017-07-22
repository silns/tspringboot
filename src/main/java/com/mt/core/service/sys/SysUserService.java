package com.mt.core.service.sys;

import com.mt.core.dao.BaseRepository;
import com.mt.core.entity.sys.SysUser;
import com.mt.core.repository.sys.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by shaojia on 2017/7/13.
 */
public class SysUserService extends CoreService<SysUser, String> {

    @Autowired
    private SysUserRepository sysUserRepository;

    public boolean updatePassword(String userId, String oldPassword, String newPassword) {
        try {
            SysUser user = get(userId);
            if(user == null) {
                System.out.println("user not exist!");
                return false;
            }
            String salt = user.getSalt();
            // TODO
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public SysUser findByUsername(String username) {
        try {
            return sysUserRepository.findByUserame(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected BaseRepository<SysUser, String> getDao() {
        return sysUserRepository;
    }

    protected boolean beforeSave(SysUser user) {
        if(exist(user.getUserId())) {
            System.out.println("User exist");
            return false;
        }
        return true;
    }
    /*private boolean exist(SysUser user) {
        if(user != null)
            return exist(user.getUserId());
        return false;
    }*/
}
