package com.example.spring_basic.api;

import com.example.spring_basic.confg.WebAppConfig;
import com.example.spring_basic.confg.WebRootConfig;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@RestController
@RequestMapping("/ ")
public class Prabhash  {

    @PostMapping
    public String saveCustomer(){
        System.out.println("saved customer");
        return "save customer";

    }

    @DeleteMapping
    public String DeleteCus( ){
        System.out.println("Delete Customer");
        return "delete customer";
    }

    @PutMapping
    public String UpdateCustomer(){
        System.out.println("put customer ");
        return "update customer0";
    }
}
