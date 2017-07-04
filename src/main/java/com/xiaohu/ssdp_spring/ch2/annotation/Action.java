package com.xiaohu.ssdp_spring.ch2.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/7/4.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action{
    String name();
}
