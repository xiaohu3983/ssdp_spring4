package com.xiaohu.ssdp_spring.ch1;

import com.xiaohu.ssdp_spring.ch1.config.DiConfig;
import com.xiaohu.ssdp_spring.ch1.config.JavaConfig;
import com.xiaohu.ssdp_spring.ch1.di.UseFunctionService;
import com.xiaohu.ssdp_spring.ch1.di.UseFunctionService1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/7/3.
 */
public class Main {

    public static void main(String[] args) {
        new Main().notBean();
        new Main().yesBean();
    }
    //采用spring注解注入，非java配置注入
    public void  notBean(){
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        String result=useFunctionService.sayHello("我是学习Spring Boot的，采用spirng注解注入");
        System.out.println(result);
        context.close();
    }
    //采用java配置@Bean注入
    public void  yesBean(){
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService1 useFunctionService = context.getBean(UseFunctionService1.class);
        String result=useFunctionService.sayHello("我是学习Spring Boot的,采用java配置中的@Bean注入");
        System.out.println(result);
        context.close();
    }

}
