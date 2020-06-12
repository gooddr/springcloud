package com.dr.filter;


import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BloomFilterUtil {
    private final static int insertions = 10000000;
    static {
        BloomFilter bloomFilter = BloomFilter.create(Funnels.stringFunnel(Charsets.UTF_8), 1000);

    }

    @Pointcut("")
    public void BloomFilterUtil(){}


}
