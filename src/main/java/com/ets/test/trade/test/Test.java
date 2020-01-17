package com.ets.test.trade.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ets.test.trade.dto.AllData;
import com.ets.test.trade.dto.CardInfo;
import com.ets.test.trade.dto.TradeData;
import com.ets.test.trade.entity.DvDevInfo;
import com.ets.test.trade.entity.TrCustCard;
import com.ets.test.trade.mapper.DvDevInfoMapper;
import com.ets.test.trade.mapper.TrCustCardMapper;
import com.ets.test.trade.util.DateUtil;
import lombok.SneakyThrows;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author DoubleC
 * @Description TODO
 * @Date 2020/1/17 9:43
 **/
@Component
public class Test implements CommandLineRunner {

    @Autowired
    DvDevInfoMapper dvDevInfoMapper;

    @Autowired
    TrCustCardMapper trCustCardMapper;


    @Override
    public void run(String... args) throws Exception {

        final String url = "http://172.168.20.12:10025/ets/gateway";

        Set<String> tradeDataStringList = getTradeDataString();

        ExecutorService executorService = Executors.newFixedThreadPool(1000);

            for (final String json : tradeDataStringList) {
                executorService.execute(new Runnable() {
                    @SneakyThrows
                    @Override
                    public void run() {
                        CloseableHttpClient httpclient = HttpClientBuilder.create().build();
                        HttpPost post = new HttpPost(url);
                        JSONObject response;
                        StringEntity s = new StringEntity(json);
                        s.setContentEncoding("UTF-8");
                        s.setContentType("application/json;charset=utf-8");//发送json数据需要设置contentType
                        post.setEntity(s);
                        long beginTime = System.currentTimeMillis();
                        HttpResponse res = httpclient.execute(post);
                        long endTime = System.currentTimeMillis();
                        long totalTime = endTime - beginTime;
                        System.out.println("交易时间为:【" + totalTime + "】毫秒");
                        if (res.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                            String result = EntityUtils.toString(res.getEntity());// 返回json格式：
                            response = JSONObject.parseObject(result);
                            String dateTime = DateUtil.date2String(new Date(), DateUtil.PATTERN_STANDARD);
                            System.out.println("结果---->"+dateTime+ " "+ response);//打印返回信息
                        }
                    }
                });
            }
        }


    public Set<String> getTradeDataString() {

        List<DvDevInfo> dvDevInfoList = dvDevInfoMapper.selectDevList();
        List<TrCustCard> trCustCardList = trCustCardMapper.selectCardList();
        Set<String> tradeDataStringList = new HashSet<>();
        Random random = new Random();
        for (int z = 0 ;z < 1 ; z ++){
            for (DvDevInfo dvDevInfo : dvDevInfoList) {
                for (TrCustCard trCustCard : trCustCardList) {
                    TradeData data = new TradeData();
                    CardInfo cardInfo = new CardInfo();
                    data.setTrade_time(DateUtil.date2String(new Date(), "yyyyMMddHHmmss"));
                    data.setOut_trade_no(random.nextInt(100)+UUID.randomUUID().toString()+random.nextInt(1000)+"D");
                    data.setTrade_amount(10);
                    data.setDiscount_amount(1);
                    data.setExtra_amount(0);
                    data.setTrade_type("TRADE_CARD");
                    data.setAcc_code(1001);
                    data.setDev_id(dvDevInfo.getDevSn());
                    data.setDept_id(dvDevInfo.getDevDeptId());
                    data.setOp_id(dvDevInfo.getOpId());
                    data.setWallet_sn(0);
                    cardInfo.setCust_code(trCustCard.getCustCode());
                    cardInfo.setCard_no(trCustCard.getCardNo());
                    cardInfo.setCard_index(trCustCard.getCardIndex());
                    cardInfo.setCard_sn(trCustCard.getCardSn());
                    data.setCard_info(cardInfo);
                    String dataJson = JSONObject.toJSONString(data);
                    AllData allData = new AllData();
                    allData.setData(dataJson);
                    String allDataJsonStr = JSON.toJSONString(allData);
                    tradeDataStringList.add(allDataJsonStr);
                }
            }
        }
        return tradeDataStringList;
    }

}
