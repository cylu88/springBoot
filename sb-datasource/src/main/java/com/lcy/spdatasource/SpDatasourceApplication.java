package com.lcy.spdatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpDatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpDatasourceApplication.class, args);
    }
}
