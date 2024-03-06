package com.hh.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 黄昊
 * @version 1.0
 **/
@RestController
//    @Controller
public class MonsterController
{
//    @RequestMapping(value = "/monster")
    @GetMapping("/monster")
    public String getMonster()
    {
        return "GET monster";
    }
    @PostMapping("/monster")
    public String postMonster()
    {
        return "POST monster";
    }
    @PutMapping("/monster")
    public String putMonster()
    {
        return "PUT monster";
    }
    @DeleteMapping("/monster")
    public String deleteMonster()
    {
        return "DELETE monster";
    }
    //先看conroller，如果没有配置视图解析器的话，会直接返回字符串
    @RequestMapping("/go")
    public String go()
    {
        return "hello";
    }
}
