package com.dp.test.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dp.test.domain.City;
import com.dp.test.service.intr.CityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dp on 2017/5/22.
 */
@RequestMapping("/city")
@RestController
public class CityController {
    
    
    @Reference(version = "1.0.0")
    private CityService cityService;
    
    @ResponseBody
    @RequestMapping("/id")
    public City selectCityByID(@RequestParam("id") Integer id) {
        return cityService.selectCityByID(id);
    }
}
