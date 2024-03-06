package com.hh.springboot.bean;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author 黄昊
 * @version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Component
public class Monster {
    private Integer id;
    private String name;
    private String skill;
    private Integer age;
    private Double sal;
    private Date birth;
//    private Car car;
}
