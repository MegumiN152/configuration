package com.hh.springboot.Controller;

import com.hh.springboot.bean.Furn;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 黄昊
 * @version 1.0
 **/
@Controller
public class DruidSqlController {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/sql")
    public List<Furn> sql(){
        BeanPropertyRowMapper<Furn> furnBeanPropertyRowMapper = new BeanPropertyRowMapper<>(Furn.class);
        List<Furn> query = jdbcTemplate.query("select*from furn", furnBeanPropertyRowMapper);
        for (Furn furn : query) {
            System.out.println(furn);
        }
        return query;
    }
}
