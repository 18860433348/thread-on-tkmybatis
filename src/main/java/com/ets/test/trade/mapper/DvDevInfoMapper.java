package com.ets.test.trade.mapper;


import com.ets.test.trade.entity.DvDevInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface DvDevInfoMapper extends Mapper<DvDevInfo> {

    DvDevInfo selectOneDev(Integer id);

    List<DvDevInfo> selectDevList();
}