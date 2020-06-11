package com.dr.controller;

import com.dr.util.FeignUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    FeignUtil feignUtil;

    @HystrixCommand(fallbackMethod = "getError")
    @RequestMapping("getUser")
    public String  getUser(String userName){
        return restTemplate.getForObject("http://provider-server/orderList?userName=" + userName, String.class);
    }


    @RequestMapping("getUserByFeign")
    public String getUserByFeign(@RequestParam(value = "userName") String userName){
        return feignUtil.sayHiFromClientOne(userName);
    }

    public String getError(String userName){
        return userName + ", 服務調用失敗！";
    }
}
