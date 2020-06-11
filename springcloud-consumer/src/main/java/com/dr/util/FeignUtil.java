package com.dr.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider-server", fallback = FeignHystric.class)
public interface FeignUtil {

    @GetMapping("/orderList")
    String sayHiFromClientOne(@RequestParam(value = "userName") String userName);
}
