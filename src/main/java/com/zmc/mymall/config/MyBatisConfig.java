package com.zmc.mymall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类:用于配置需要动态生成的mapper接口的路径
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan("com.zmc.mymall.mbg.mapper")
public class MyBatisConfig {
}
