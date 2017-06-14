package com.xiao.work.saivian.receipt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiao on 2017/6/14.
 */
@Controller
public class HelloWordController {
    @RequestMapping("index")
    public String hellow(){
        return "index";
    };
}
