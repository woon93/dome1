package com.wrong.demo1.configurer;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyWebAppConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将所有C:/Users/gzpost05/Desktop/springboot博客/ 访问都映射到/myTest/** 路径下
        registry.addResourceHandler("/demoData/**").addResourceLocations("file:E:/dome1/data/");
    }
}

