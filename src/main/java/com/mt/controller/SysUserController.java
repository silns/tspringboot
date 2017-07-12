package com.mt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shaojia on 2017/7/11.
 */
@RestController
@RequestMapping("/user")
public class SysUserController {

    @RequestMapping("/add")
    public String add() {
        return "add";
    }

}
