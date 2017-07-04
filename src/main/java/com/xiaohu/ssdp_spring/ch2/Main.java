package com.xiaohu.ssdp_spring.ch2;

import com.xiaohu.ssdp_spring.ch2.config.AopConfig;
import com.xiaohu.ssdp_spring.ch2.d2.DemoAnnotationService;
import com.xiaohu.ssdp_spring.ch2.d2.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/7/4.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
}
