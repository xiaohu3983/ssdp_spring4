package com.xiaohu.ssdp_spring.ch3.config;

import com.xiaohu.ssdp_spring.ch3.test.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Administrator on 2017/7/4.
 */
@Configuration
public class TestConfig {
    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("我是来自开发环境");
    }

    @Bean
    @Profile("prod")
    public  TestBean prodTestBean(){
        return  new TestBean("我是来自生产环境");
    }
}
