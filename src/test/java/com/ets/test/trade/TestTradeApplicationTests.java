package com.ets.test.trade;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ets.test.trade.dto.AllData;
import com.ets.test.trade.dto.CardInfo;
import com.ets.test.trade.dto.TradeData;
import com.ets.test.trade.entity.DvDevInfo;
import com.ets.test.trade.entity.TrCustCard;
import com.ets.test.trade.mapper.DvDevInfoMapper;
import com.ets.test.trade.mapper.TrCustCardMapper;
import com.ets.test.trade.service.BaseService;
import com.ets.test.trade.service.TrCustCardService;
import com.ets.test.trade.util.DateUtil;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Random;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestTradeApplicationTests {

    @Autowired
    DvDevInfoMapper dvDevInfoMapper;

    @Autowired
    TrCustCardMapper trCustCardMapper;

    @Autowired
    TrCustCardService trCustCardService;

    @Test
    public void contextLoads() {

        String url = "http://172.168.20.12:10025/ets/gateway";

        // while(true){
        for (int i = 0; i < 10; i++) {
            String allDataJsonStr = getAllData();
            System.out.println(allDataJsonStr);
            try {
                JSONObject jsonObject = doPost(url, allDataJsonStr);
                System.out.println("结果" + jsonObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static JSONObject doPost(String url, String json){
        CloseableHttpClient httpclient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);
        JSONObject response = null;
        try {
            StringEntity s = new StringEntity(json.toString());
            s.setContentEncoding("UTF-8");
            s.setContentType("application/json;charset=utf-8");//发送json数据需要设置contentType
            post.setEntity(s);
            HttpResponse res = httpclient.execute(post);
            if(res.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
                String result = EntityUtils.toString(res.getEntity());// 返回json格式：
                response = JSONObject.parseObject(result);
                System.out.println(response);//打印返回信息
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return response;
    }

    public String getAllData(){
        TradeData tradeData = getTradeData();
        String dataJson = JSONObject.toJSONString(tradeData);
        AllData allData  = new AllData();
        allData.setData(dataJson);
        String allDataJsonStr = JSON.toJSONString(allData);
        return allDataJsonStr;
    }

    public TradeData getTradeData(){
        TradeData data = new TradeData();
        CardInfo cardInfo = new CardInfo();
        data.setTrade_time(DateUtil.date2String(new Date(),"yyyyMMddHHmmss"));
        data.setOut_trade_no(String.valueOf(new Date().getTime()));
        data.setTrade_amount(new Random().nextInt(100));
        data.setDiscount_amount(new Random().nextInt(10));
        data.setExtra_amount(0);
        data.setTrade_type("TRADE_CARD");
        data.setAcc_code(1001);
        DvDevInfo dvDevInfo = dvDevInfoMapper.selectOneDev(38);
        data.setDev_id(dvDevInfo.getDevSn());
        data.setDept_id(dvDevInfo.getDevDeptId());
        data.setOp_id(dvDevInfo.getOpId());
        data.setWallet_sn(0);
        TrCustCard trCustCard = trCustCardMapper.getOneCardInfo(140);
        cardInfo.setCust_code(trCustCard.getCustCode());
        cardInfo.setCard_no(trCustCard.getCardNo());
        cardInfo.setCard_index(trCustCard.getCardIndex());
        cardInfo.setCard_sn(trCustCard.getCardSn());
        data.setCard_info(cardInfo);
        return data;
    }

}
