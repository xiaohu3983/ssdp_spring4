package com.xiaohu.ssdp_spring.ch2.d2;

import com.xiaohu.ssdp_spring.ch2.annotation.Action;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/4.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截Add方法的详细操作")
    public void add() {

    }
}
