package com.atguigu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author superherozhang
 * @create 2022-09-30 10:20
 */
@Configuration //作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.atguigu"})  //开启组件扫描
public class SpringConfig {
}
