package com.xiaohu.ssdp_spring.ch1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/7/3.
 */
//java 配置类；
//对于spring创建Bean，Spring提供了使用XML、注解、Java配置、groovy配置实现Bean的创建和注人
@Configuration//利用此注解申明是一个配置类
@ComponentScan("com.xiaohu.ssdp_spring.ch1.di") //自动扫描包名下所有使用@Component、@Service、@Controller、@Repository的类，并负责注册为Bean
public class DiConfig {

}
