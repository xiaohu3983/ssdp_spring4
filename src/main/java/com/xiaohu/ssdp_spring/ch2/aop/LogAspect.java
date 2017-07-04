package com.xiaohu.ssdp_spring.ch2.aop;

import com.xiaohu.ssdp_spring.ch2.annotation.Action;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/7/4.
 */
@Aspect //通过@Aspect注解声明一个切面
@Component //让此切面成为spring容器管理的Bean
public class LogAspect {
    @Pointcut("@annotation(com.xiaohu.ssdp_spring.ch2.annotation.Action)")
    public  void annotationPointCut(){
        System.out.println("------------------");
    }

    @After("annotationPointCut()")
    //使用专门定义的拦截规则作为参数切入
    public  void after(JoinPoint joinPoint){//
        MethodSignature methodSignature=(MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("被配置了专门规则拦截，即注解式拦截生效，"+action.name());

    }

    @Before("execution(* com.xiaohu.ssdp_spring.ch2.d2.*.*(..))")
    //使用拦截规则作为参数直接切入
    public  void  before(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("只要满足注解规则，即方法规则生效，是拦截，"+method.getName());

    }
}
