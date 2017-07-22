package com.mt.core.web.sys;

import com.mt.core.repository.sys.SysUserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by shaojia on 2017/7/11.
 */

@RestController
@RequestMapping("/user")
public class SysUserController {
    @Resource
    private SysUserRepository userRepository;

    @RequestMapping("/add")
    public String add() {
        if(userRepository == null)
            System.out.println("null");
        System.out.println("not null");
        userRepository.doSomething();

        return "add";
    }

    @RequestMapping("/delete")
    public String delete() {
        return "delete";
    }
}
