package com.hh.springboot.Controller;

import com.hh.springboot.bean.Monster;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author 黄昊
 * @version 1.0
 **/
@Controller
public class ParameterController {
    @RequestMapping("/param/{id}/{username}")
    public ModelAndView PathMonster(@PathVariable("id") Integer id,@PathVariable("username") String username){
        System.out.println("id:"+id+" username:"+username);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("id",id);
        modelAndView.addObject("username",username);
        return modelAndView;
    }
    @GetMapping("/requestheader")
    public String requestHeader(@RequestHeader("Host") String host,
    @RequestHeader Map<String,String> header){
        System.out.println("Host:"+host);
        return "success";
    }
    @GetMapping("/requestparam")
    public String requestparam(@RequestParam("name") List<String> names, @RequestParam("age") Integer age){
        for (String s : names) {
            System.out.println(s+" "+age);
        }
        return "success";
    }
    @GetMapping("/cookie")
    public String cookie(@CookieValue("cookie_key") String cookie_value,
                         @CookieValue("username")Cookie cookie,
                         HttpServletRequest httpServletRequest){
        System.out.println("cookie_key:"+cookie_value);
        System.out.println("username:"+cookie.getName()+"-"+cookie.getValue());
        Cookie[] cookies = httpServletRequest.getCookies();
        for (Cookie cookie1 : cookies) {
            System.out.println("request="+cookie1.getName()+"-"+cookie1.getValue());
        }
        return "success";
    }
    @PostMapping("/save")
    @ResponseBody
    public String save(@RequestBody String content){
        System.out.println(content);
        return "success";
    }
    @PostMapping("/savemonster")
    public String saveMonster(Monster monster){
        System.out.println(monster);
        return "success";
    }
}
