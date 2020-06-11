package com.dr.controller;

import com.dr.util.FeignUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @RequestMapping("getUser")
    public ResponseEntity<String> getUser(String userName){
        return restTemplate.getForEntity("http://provide-server/springboot/getUserByGet?userName=" + userName, String.class);
    }

    @RequestMapping("getUserByFeign")
    public String getUserByFeign(@RequestParam(value = "userName") String userName){
        return feignUtil.sayHiFromClientOne(userName);
    }
}
