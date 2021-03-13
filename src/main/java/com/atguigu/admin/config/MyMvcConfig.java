package com.atguigu.admin.config;


//全面扩展MVC

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Bean
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }

    //定义了一个自己的视图解析器
    public static class MyViewResolver implements ViewResolver{


        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }

//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("index");
//        registry.addViewController("index.html").setViewName("index");
//        registry.addViewController("login.html").setViewName("login");
//        registry.addViewController("test01.html").setViewName("test01");
//    }
}
