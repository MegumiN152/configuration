package com.hh.springboot.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author 黄昊
 * @version 1.0
 **/
@Slf4j
//@WebListener(value = "")
public class HhListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("HhListener初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("HhListener销毁");
    }
}
