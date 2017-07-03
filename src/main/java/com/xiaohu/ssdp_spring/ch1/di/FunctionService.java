package com.xiaohu.ssdp_spring.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/3.
 */
@Service
//使用@Service注解声明当前FunctionService类是Spring管理的一个Bean，其中，使用
//@Component、@Service、@Controller、@Repository是等效的，可以根据需要选用
public class FunctionService {
  public String sayHello(String word){
      return "Hello" +word+"!";
  }
}
