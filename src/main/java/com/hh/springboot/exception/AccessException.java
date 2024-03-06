package com.hh.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author 黄昊
 * @version 1.0
 **/
@ResponseStatus(HttpStatus.FORBIDDEN)
public class AccessException extends RuntimeException{
    public AccessException(String message) {
        super(message);
    }
    public AccessException() {
        super();
    }

}
