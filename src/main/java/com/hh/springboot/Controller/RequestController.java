package com.hh.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author 黄昊
 * @version 1.0
 **/
@Controller
public class RequestController {
    @GetMapping("/login1")
    public String login(HttpServletRequest request){
        request.setAttribute("msg","登录成功");
        return "forward:/ok";
    }
    @GetMapping("/ok")
    public String ok(@RequestAttribute(value = "msg",required = false) String msg){
        System.out.println(msg);
        return "success";
    }
    @GetMapping("/register")
    public String register(Map<String,String> map,
                                 Model model,
                           HttpServletResponse response) {
        map.put("msg", "注册成功");
        map.put("job", "java架构师");
        model.addAttribute("sal", 100000);
        Cookie cookie = new Cookie("username", "hh111");
        response.addCookie(cookie);
        return "forward:/registerok";
    }
    @ResponseBody
    @GetMapping("/registerok")
    public String registerok(@RequestAttribute("msg") String msg,
                             @RequestAttribute("job") String job,
                             @RequestAttribute("sal") Integer sal){
        System.out.println(msg);
        System.out.println(job);
        System.out.println(sal);
        return "success";
    }
}
