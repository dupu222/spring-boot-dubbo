package com.dp.test.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dp.test.dao.intr.CityMapper;
import com.dp.test.domain.City;
import com.dp.test.service.intr.CityService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by dp on 2017/5/22.
 */
@Service(version = "1.0.0")
public class CityServiceImpl implements CityService {
    
    
    @Autowired
    private CityMapper cityMapper;
    
    @Override
    public City selectCityByID(Integer id) {
        return cityMapper.selectByPrimaryKey(id);
    }
}
