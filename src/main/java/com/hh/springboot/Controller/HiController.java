package com.hh.springboot.Controller;

import com.hh.springboot.bean.Monster;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 黄昊
 * @version 1.0
 **/
@RestController
public class HiController {
    @Resource
    private Monster monster;
    @RequestMapping("/monster")
    public Monster getMonster(){
        return monster;
    }
}
