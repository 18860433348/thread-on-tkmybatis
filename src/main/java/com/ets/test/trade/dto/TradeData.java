package com.ets.test.trade.dto;

import lombok.Data;

/**
*@Author DoubleC
*@Description TODO
*@Date 2020/1/16 17:25
**/
@Data
public class TradeData {
    private String trade_time;
    private String out_trade_no;
    private Integer trade_amount;
    private Integer discount_amount;
    private Integer extra_amount;
    private String dev_id;
    private Integer dept_id;
    private Integer op_id;
    private Integer wallet_sn;
    private String trade_type;
    private CardInfo card_info;
    private Integer acc_code;
}
