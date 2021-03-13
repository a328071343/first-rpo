package com.atguigu.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexcontroller {

    @RequestMapping("index")
    public String index(){
        return "index.html";
    }

    @RequestMapping("index2")
    @ResponseBody
    public String res(){
        return "index.html";
    }

}
