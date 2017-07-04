package com.xiaohu.ssdp_spring.ch2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Administrator on 2017/7/4.
 */
@Configuration
@ComponentScan("com.xiaohu.ssdp_spring.ch2.*")
@EnableAspectJAutoProxy//注解开启spring对AspectJ的支持
public class AopConfig {

}
