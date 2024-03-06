package com.hh.springboot.Controller;

import com.hh.springboot.bean.Admin;
import com.hh.springboot.bean.Monster;
import com.hh.springboot.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author 黄昊
 * @version 1.0
 **/
@Controller
public class AdminController {
    @PostMapping("/login")
    public String login(Admin admin, HttpSession session, Model model) {
        if (StringUtils.hasText(admin.getName()) && "123456".equals(admin.getPassword())) {
            session.setAttribute("loginUser", admin);
            //重定向防止刷新页面重复提交表单
            return "redirect:/manage.html";
        }else {
            model.addAttribute("msg", "用户名或密码错误");
            return "adminLogin";
        }
    }
    @GetMapping("/manage.html")
    public String mainpage(Model model,HttpSession session) {
        Object loginUser = session.getAttribute("loginUser");
//        if (null==loginUser) {
//            model.addAttribute("msg", "你没有登录");
//            return "adminLogin";
//        }
//        ArrayList<User> users = new ArrayList<>();
//        users.add(new User(1,"hh","6666",20,"123@qq.com"));
//        users.add(new User(2,"hh2","6666",210,"456@qq.com"));
//        users.add(new User(3,"hh3","6666",220,"456@qq.com"));
//        users.add(new User(4,"hh4","6666",420,"456@qq.com"));
//        users.add(new User(5,"hh5","6666",2560,"456@qq.com"));
//        model.addAttribute("users",users);
        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.add(new Monster(1,"hh","吃饭",10, 10000.0,new Date()));
        monsters.add(new Monster(2,"hh2","睡觉",20, 20000.0,new Date()));
        monsters.add(new Monster(3,"hh3","打豆豆",30, 30000.0,new Date()));
        monsters.add(new Monster(4,"hh4","打豆豆",40, 40000.0,new Date()));
        monsters.add(new Monster(5,"hh5","打豆豆",50, 50000.0,new Date()));
        model.addAttribute("monsters",monsters);
        return "manage";
    }
}
