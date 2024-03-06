package com.hh.springboot.Controller;

import com.hh.springboot.exception.AccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author 黄昊
 * @version 1.0
 **/
@Controller
public class MyErrorController {
    @GetMapping("/err")
    public String err() {
        int i = 10 / 0;
        return "manage";
    }

    @PostMapping("/err1")
    public String err1() {
        return "manage";
    }

    @GetMapping("/err2")
    public String err2(String name) {
        if (!"tom".equals(name))
            throw new AccessException("用户名不能为tom");
        return "manage";
    }
}
