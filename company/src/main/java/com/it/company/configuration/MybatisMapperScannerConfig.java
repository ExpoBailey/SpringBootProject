package com.it.company.configuration;

import com.it.company.core.anno.MyMapper;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p><p>
 * <describe></describe>
 * @Author Bailey
 * @Email zhuwj@minstone.com.cn
 * @Date 2017/8/16 16:48
 * @Since jdk1.8
 * @Version 1.0.0
 */
@Configuration
@AutoConfigureAfter(DataSourceConfig.class)
public class MybatisMapperScannerConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.it.**.dao");
        mapperScannerConfigurer.setAnnotationClass(MyMapper.class);
        return mapperScannerConfigurer;
    }

}
