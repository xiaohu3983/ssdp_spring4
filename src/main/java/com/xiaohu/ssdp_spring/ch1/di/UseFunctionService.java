package com.xiaohu.ssdp_spring.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/3.
 */
@Service
public class UseFunctionService {
    @Autowired //用@Autowired将FunctionService注解到UseFunctionService中，让UseFunctionService具有FunctionService的
               //功能,此处使用JSR-330的@Inject注解或者JSR-250的@Resource注解是等效的
    FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
