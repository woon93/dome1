package com.wrong.demo1.configurer;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebAppConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将所有【E:/dome1/data/】 访问都映射到【/demoData/**】路径下
        registry.addResourceHandler("/demoData/**").addResourceLocations("file:E:/dome1/data/");
    }
}

