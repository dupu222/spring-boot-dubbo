package com.dp.test.service;

import com.dp.test.domain.City;
import com.dp.test.service.intr.CityService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by dp on 2017/5/22.
 */
@MapperScan("com.dp.test.dao.intr")
@SpringBootApplication
public class DubboServer {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DubboServer.class, args);
    
        CityService bean = context.getBean(CityService.class);
        City city = bean.selectCityByID(1);
        System.out.println(city);
    }
}
