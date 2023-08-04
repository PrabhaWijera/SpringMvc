package com.example.spring_basic;

import com.example.spring_basic.confg.WebAppConfig;
import com.example.spring_basic.confg.WebRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppinitializer extends AbstractAnnotationConfigDispatcherServletInitializer {//start wenne the package of this class and all subpackeges for components

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
                WebRootConfig.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                WebAppConfig.class
        };// root ekai config ekai kiyla 2k thino why ee?---specific beans wenam }} not specific wenvama thiyenva[ root & sevelet ]=dispater selelvet
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};// come to request to servelete  -1
    }
}
