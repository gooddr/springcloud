package com.dr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @RequestMapping("list")
    public String orderList(){
        return "orders is there";
    }
}
