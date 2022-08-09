package com.cloud.sd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: shiding
 * @data: 2022/8/9 14:29
 **/
@RestController
@RequestMapping("/sms")
public class SmsController {

    @GetMapping("/send")
    public String sendSms(){
        return "发送成功！";
    }
}
