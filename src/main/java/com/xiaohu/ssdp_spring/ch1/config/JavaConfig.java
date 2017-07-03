package com.xiaohu.ssdp_spring.ch1.config;

import com.xiaohu.ssdp_spring.ch1.di.FunctionService1;
import com.xiaohu.ssdp_spring.ch1.di.UseFunctionService1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/7/3.
 */
@Configuration
public class JavaConfig {
  @Bean//采用Java配置的@Bean注解申明当前方法返回一个Bean，Bean的名称是方法名
  public FunctionService1 functionService(){
      return  new FunctionService1();
  }

  @Bean
  public UseFunctionService1 useFunctionService(){
      UseFunctionService1 useFunctionService=new UseFunctionService1();
      useFunctionService.setFunctionService1(this.functionService());
      return  useFunctionService;
  }
}
