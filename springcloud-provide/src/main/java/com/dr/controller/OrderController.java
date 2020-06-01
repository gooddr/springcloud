package com.dr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OrderController {

    @RequestMapping("/orderList")
    public String orderList(){
        return "orders is there";
    }
}
