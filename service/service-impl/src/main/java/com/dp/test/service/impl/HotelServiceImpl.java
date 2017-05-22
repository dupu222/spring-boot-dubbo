package com.dp.test.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dp.test.domain.Hotel;
import com.dp.test.service.intr.HotelService;

/**
 * Created by dp on 2017/5/22.
 */
@Service(version = "1.0.0")
public class HotelServiceImpl implements HotelService {
    @Override
    public Hotel selectHotelByCityId(Integer id) {
        return null;
    }
}
