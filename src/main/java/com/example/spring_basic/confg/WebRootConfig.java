package com.example.spring_basic.confg;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
//
public class WebRootConfig  {
    public WebRootConfig(){
        System.out.println(
                "web root"
        );
    }
}
