package com.hh.springboot.config;

import com.hh.springboot.filter.HhFilter;
import com.hh.springboot.servlet.Servlet_;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;
import java.util.Arrays;

/**
 * @author 黄昊
 * @version 1.0
 **/
@Configuration
public class RegisterConfig {
    @Bean
    public ServletRegistrationBean servlet_(){
        Servlet_ servlet = new Servlet_();
        return new ServletRegistrationBean(servlet,"/servlet01","/servlet02");
    }
    @Bean
    public FilterRegistrationBean filter_(){
        HhFilter hhFilter = new HhFilter();
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(hhFilter);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/css/*","/images/* "));
        return filterRegistrationBean;
    }

}
