package com.lcy.spdatasource.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * mybatis主数据源连接配置
 */
@Configuration
@MapperScan(value = "com.lcy.spdatasource.mapper",sqlSessionFactoryRef = "masterSqlSessionFactoryBean")
public class MyBatisMasterConfig {

    @Autowired
    @Qualifier("mastDataSource")
    DataSource mastDataSource;

    @Bean(name="masterSqlSessionFactoryBean")
    public SqlSessionFactory masterSqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(mastDataSource);

        return factoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate1() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(masterSqlSessionFactoryBean()); // 使用上面配置的Factory
        return template;
    }

    /**
     * 配置事务
     * @param dataSource
     * @return
     */
    @Bean(name = "masterTransactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("mastDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
