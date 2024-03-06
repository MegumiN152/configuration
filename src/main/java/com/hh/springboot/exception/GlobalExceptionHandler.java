package com.hh.springboot.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author 黄昊
 * @version 1.0
 **/
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler({ArithmeticException.class, NullPointerException.class, AccessException.class})
    public String handlerAritException(Exception e, Model model){
        log.info("异常信息={}",e.getMessage());
        model.addAttribute("msg",e.getMessage() );
        return "/error/global";
    }
}
