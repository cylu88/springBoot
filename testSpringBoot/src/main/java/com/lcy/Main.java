package com.lcy;


import com.github.pagehelper.PageHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

//@SpringBootApplication(exclude = { RedisAutoConfiguration.class })
@SpringBootApplication
@Configuration
//开启事务
@EnableTransactionManagement
//扫描mapper接口@MapperScan("zytrade.service.mobile.dao")//接口扫描，如果此处不加@MapperScan注解必须在接口类上添加@Mapper注解表明这是一个接口扫描器
//@MapperScan("com.lcy.mapper.*.mapper")
@ServletComponentScan
public class Main {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Main.class);
//        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

    //配置mybatis的分页插件pageHelper
    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
        pageHelper.setProperties(properties);
        return pageHelper;
    }
}
