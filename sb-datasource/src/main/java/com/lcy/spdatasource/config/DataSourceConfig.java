package com.lcy.spdatasource.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 数据库原配置
 */
@Configuration
public class DataSourceConfig {

    /**
     * 主数据源
     * @return
     */
    @Bean(name="mastDataSource")
    @ConfigurationProperties(prefix="datasource.master") //// application.properteis中对应属性的前缀
    public DataSource mastDataSource(){
        return DataSourceBuilder.create().build();
    }

    /**
     * 从数据源
     * @return
     */
    @Bean(name="slaveDataSource")
    @ConfigurationProperties(prefix = "datasource.slave")
    public DataSource slaveDataSource(){
        return DataSourceBuilder.create().build();
    }
}
