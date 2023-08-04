package com.example.spring_basic.confg;


import com.example.spring_basic.WebAppinitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration//bean eka hadenna oni    komd kiyana eka--source for bean definition
@EnableWebMvc//spring mvc wal full power ek nh,but basic tik hmbenva[meka damme nathi unoth]
@ComponentScan(basePackageClasses = WebAppinitializer.class)//scanning krnn sub clss component search krnn adal clss eke
//ioc ekk wada krnn plwn wene - component and beans oni wenne

public class WebAppConfig {
    public WebAppConfig(){
        System.out.println("hello spring mvc");

    }
}
// mekama krna thwa vidi mond kiyala blnn ?