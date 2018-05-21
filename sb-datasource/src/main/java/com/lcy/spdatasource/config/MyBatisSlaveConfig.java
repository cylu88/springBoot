package com.lcy.spdatasource.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * mybatis从数据源连接配置
 */
@Configuration
@MapperScan(value = "com.lcy.spdatasource.slavemapper",sqlSessionFactoryRef = "slaveSqlSessionFactoryBean")
public class MyBatisSlaveConfig {

    @Autowired
    @Qualifier("slaveDataSource")
    DataSource slaveDataSource;

    @Bean(name="slaveSqlSessionFactoryBean")
    public SqlSessionFactory slaveSqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(slaveDataSource);

        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate1() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(slaveSqlSessionFactoryBean()); // 使用上面配置的Factory
        return template;
    }
}
