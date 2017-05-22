package com.dp.test.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by dp on 2017/5/22.
 */
@SpringBootApplication
public class DubboClient extends SpringBootServletInitializer{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DubboClient.class);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(DubboClient.class);
        
        
    }
}
