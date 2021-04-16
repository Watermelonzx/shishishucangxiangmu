package com.atguigu.gmall.gmall1021logger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @RequestMapping("/sayHi")
    public String sayHi() {
        return "success";
    }

}
