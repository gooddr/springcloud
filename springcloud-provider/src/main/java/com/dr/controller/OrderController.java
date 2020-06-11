package com.dr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Value("${server.port}")
    String port;

    @RequestMapping("orderList")
    public String orderList(@RequestParam(value = "userName") String userName){
        return "Hi, " + userName + ".there are orders. this server is " + port;
    }
}
