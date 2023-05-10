package com.xzzzf.shardingjdbcdemo;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xzzzf.shardingjdbcdemo.mapper")
public class ShardingjdbcdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingjdbcdemoApplication.class, args);
    }

}
