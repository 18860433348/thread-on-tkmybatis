package com.ets.test.trade.dto;

import lombok.Data;

/**
*@Author DoubleC
*@Description TODO
*@Date 2020/1/16 17:25
**/
@Data
public class AllData {


    private String legal_person_code = "200116841036";
    private String function = "etsapi/trade";
    private String version = "V1.0.0";
    private String sign_type = "MD5";
    private String sign = "968ae7383538f2b5d4be13617e759f10";
    private String data;

}
