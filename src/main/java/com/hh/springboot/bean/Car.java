package com.hh.springboot.bean;

import lombok.*;
import org.springframework.stereotype.Component;

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
public class Car {
    private String name;
    private Double price;
}
