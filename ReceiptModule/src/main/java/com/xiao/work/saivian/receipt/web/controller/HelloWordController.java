package com.xiao.work.saivian.receipt.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiao on 2017/6/14.
 */
@Controller
@RequestMapping
public class HelloWordController {


    @RequestMapping("index")
    public String hellow(){
        return "index";
    };

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("page/404")
    public String i(){
        return "index";
    }
}
