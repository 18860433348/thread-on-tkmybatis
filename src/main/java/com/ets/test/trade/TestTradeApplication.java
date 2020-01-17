package com.ets.test.trade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//注意:集成tk.mybatis后这里的mapperScan要换成tk的
@MapperScan("com.ets.test.trade.mapper")
public class TestTradeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestTradeApplication.class, args);
    }

}
