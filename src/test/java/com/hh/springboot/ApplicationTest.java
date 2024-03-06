package com.hh.springboot;

import com.hh.springboot.bean.Furn;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;

/**
 * @author 黄昊
 * @version 1.0
 **/
@SpringBootTest
public class ApplicationTest {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Test
    public void test(){
        BeanPropertyRowMapper<Furn> furnBeanPropertyRowMapper = new BeanPropertyRowMapper<>(Furn.class);
          jdbcTemplate.query("select*from furn",furnBeanPropertyRowMapper).forEach(System.out::println);
    }
}
