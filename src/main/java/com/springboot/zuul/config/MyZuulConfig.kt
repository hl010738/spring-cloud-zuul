package com.springboot.zuul.config

import com.springboot.zuul.filter.MyZuulFilter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MyZuulConfig {

    @Bean
    fun zuulFilter(): MyZuulFilter {
        return MyZuulFilter()
    }
}
