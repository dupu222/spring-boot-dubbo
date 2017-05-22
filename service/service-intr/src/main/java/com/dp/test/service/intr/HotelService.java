package com.dp.test.service.intr;

import com.dp.test.domain.Hotel;

/**
 * Created by dp on 2017/5/22.
 */
public interface HotelService {
    Hotel selectHotelByCityId(Integer id);
}
