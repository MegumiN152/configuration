package com.hh.springboot.utils;

import java.time.LocalDateTime;

/**
 * @author 黄昊
 * @version 1.0
 **/
public class Webutils {
    public static String getYearMonthDay() {
        //如何得到当前的日期-> java基础 日期 三代类
        LocalDateTime ldt = LocalDateTime.now();
        int year = ldt.getYear();
        int monthValue = ldt.getMonthValue();
        int dayOfMonth = ldt.getDayOfMonth();
        String yearMonthDay = year + "/" + monthValue + "/" + dayOfMonth + "/";
        return yearMonthDay;
    }
}
