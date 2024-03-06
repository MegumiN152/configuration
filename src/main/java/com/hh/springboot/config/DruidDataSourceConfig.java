//package com.hh.springboot.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.support.http.StatViewServlet;
//import com.alibaba.druid.support.http.WebStatFilter;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//import java.sql.SQLException;
//import java.util.Arrays;
//
///**
// * @author 黄昊
// * @version 1.0
// **/
//@Configuration
//public class DruidDataSourceConfig {
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource dataSource() throws SQLException {
//        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setFilters("stat,wall");
//        return druidDataSource;
//    }
//    @Bean
//    public ServletRegistrationBean statViewServlet(){
//        StatViewServlet statViewServlet = new StatViewServlet();
//        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<>(statViewServlet, "/druid/*");
//        registrationBean.addInitParameter("loginUsername","admin");
//        registrationBean.addInitParameter("loginPassword","123456");
//        return registrationBean;
//    }
//    @Bean
//    public FilterRegistrationBean webStatFilter(){
//        WebStatFilter webStatFilter = new WebStatFilter();
//        FilterRegistrationBean<WebStatFilter> webStatFilterFilterRegistrationBean = new FilterRegistrationBean<>(webStatFilter);
//        webStatFilterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
//        webStatFilterFilterRegistrationBean.addInitParameter("exclusions","*.js,*.css,*.gif,*.jpg,*.png,/druid/*");
//        return webStatFilterFilterRegistrationBean;
//    }
//}
