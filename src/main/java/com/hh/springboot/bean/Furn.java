package com.hh.springboot.bean;

import lombok.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

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
public class Furn {
    private String name;
    private String maker;
    private BigDecimal price;
    private Integer sales;
    private Integer stock;
    private String imgPath="static/img/default.jpg";
}
