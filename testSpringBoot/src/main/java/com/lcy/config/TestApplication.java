package com.lcy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySource(value = { "classpath:jdbc.properties"})
@ComponentScan(basePackages = "com.lcy")
public class TestApplication extends SpringBootServletInitializer {
    /*@Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.driverClassName}")
    private String jdbcDriverClassName;

    @Value("${jdbc.username}")
    private String jdbcUsername;

    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // 数据库驱动
        dataSource.setDriverClassName(jdbcDriverClassName);
        // 相应驱动的jdbcUrl
        dataSource.setUrl(jdbcUrl);
        // 数据库的用户名
        dataSource.setUsername(jdbcUsername);
        // 数据库的密码
        dataSource.setPassword(jdbcUsername);
        return dataSource;
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TestApplication.class);
    }*/

}
