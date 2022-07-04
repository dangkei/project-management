package com.bgp.report;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.bgp.report.mapper") 
@SpringBootApplication
public class DailyReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(DailyReportApplication.class, args);
    }

}
