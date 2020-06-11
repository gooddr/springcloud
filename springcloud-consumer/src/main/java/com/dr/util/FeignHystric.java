package com.dr.util;

import org.springframework.stereotype.Component;

@Component
public class FeignHystric implements FeignUtil {

    @Override
    public String sayHiFromClientOne(String userName) {
        return userName + ", 服务调用失败！";
    }
}
