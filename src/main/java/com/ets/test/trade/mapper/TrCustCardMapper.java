package com.ets.test.trade.mapper;

import com.ets.test.trade.entity.TrCustCard;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TrCustCardMapper extends Mapper<TrCustCard> {

    TrCustCard getOneCardInfo(Integer id);

    List<TrCustCard> selectCardList();

}