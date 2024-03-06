package com.hh.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author 黄昊
 * @version 1.0
 **/
@Controller
public class IndexController {
    @GetMapping({"/login","/"})
    public String login(){
        return "adminLogin";
    }
}
