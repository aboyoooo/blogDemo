package com.aboyoooo.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Zihan Soong
 * @date 2020/7/26 15:24
 * @description:
 */

@Configuration
@EnableTransactionManagement
@MapperScan("com.aboyoooo.mapper")

public class MyBatisPlusConfig {

    @Bean
//    添加分页插件
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }

}
