package com.cloud.sd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: shiding
 * @data: 2022/8/9 14:29
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/me")
    public String me(){
        return "这是我的一个服务-8091";
    }

    @GetMapping("/one")
    public String one(){
        return "这是我的一个接口";
    }
}
