package com.dr.filter;


import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

@Aspect
@Component
public class BloomFilterUtil {
    private final static int insertions = 1000000;
    static HashSet<String> hashSet = new HashSet();
    static ArrayList<String> arrayList = new ArrayList();
    static BloomFilter bloomFilter;
    static {
        bloomFilter = BloomFilter.create(Funnels.stringFunnel(Charsets.UTF_8), insertions);

        for(int i=0;i<insertions;i++){
            String uuid = UUID.randomUUID().toString();
            bloomFilter.put(uuid);
            hashSet.add(uuid);
            arrayList.add(uuid);
        }
    }


    public static void main(String[] args) {
        int rigth = 0;
        int wrong = 0;
        for(int i=0; i<insertions; i++){
            String test = i%100==0? arrayList.get(i):UUID.randomUUID().toString();
            if(bloomFilter.mightContain(test)){
                if(hashSet.contains(test)){
                    rigth++;
                }else {
                    wrong++;
                }
            }
        }
        System.out.println("rigth="+ rigth);
        System.out.println("wrong="+ wrong);
    }

    @Pointcut("")
    public void BloomFilterUtil(){}


}
