package com.hh.springboot.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author 黄昊
 * @version 1.0
 **/
@Slf4j
//@WebFilter(urlPatterns = {"/css/*","/images/*"})
public class HhFilter implements Filter{
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("HhFilter");
        HttpServletRequest servletRequest1 = (HttpServletRequest) servletRequest;
        log.info("HhFilter-url:{}",servletRequest1.getRequestURI());
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       log.info("HhFilter初始化");
    }

    @Override
    public void destroy() {
       log.info("HhFilter销毁");
    }
}
