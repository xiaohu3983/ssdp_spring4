package com.xiaohu.ssdp_spring.ch1.di;

/**
 * Created by Administrator on 2017/7/3.
 * JAVA 配置注入Bean测试
 */
public class UseFunctionService1 {

    FunctionService1 functionService;

    public void setFunctionService1(FunctionService1 functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
