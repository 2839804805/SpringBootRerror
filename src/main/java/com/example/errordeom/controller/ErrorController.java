package com.example.errordeom.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("error")
public class ErrorController {
    //private static  final Logger log = LoggerFactory.getLogger(ErrorController.class);

    @RequestMapping("index")
    public String errorLook(ModelMap map){
       // log.info("出错了，进入自定义页面！");
        map.put("title","首页");
        return "index";
    }
    @RequestMapping("text")
    public RuntimeException errortext(ModelMap map){
        return  new RuntimeException("测试异样");
    }
}
