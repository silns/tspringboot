package com.mt.core.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by shaojia on 2017/7/14.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/index")
    public String index(Map<String, Object> map) {
        map.put("index", "this is the values");
        return "index";
    }
}
