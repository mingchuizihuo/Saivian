package com.xiao.work.saivian.receipt.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiaolitong on 2017/6/14.
 */
@Controller
@RequestMapping("receipt")
public class ReceiptController {

    @RequestMapping("getReceipt")
    public String receipt(){
        return ""
    }
}
