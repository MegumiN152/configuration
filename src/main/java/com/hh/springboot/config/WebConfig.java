package com.hh.springboot.config;

import com.hh.springboot.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.util.ObjectUtils;

/**
 * @author 黄昊
 * @version 1.0
 **/
@Configuration(proxyBeanMethods = false)
public class WebConfig {
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer() {
            @Override
            public void addFormatters(FormatterRegistry registry) {
                Converter<String, Car> converter1  =new Converter<String, Car>() {
                    @Override
                    public Car convert(String s) {
                        if (!StringUtils.isEmpty(s)){
                            Car car = new Car();
                            String[] split = s.split(",");
                            car.setName(split[0]);
                            car.setPrice(Double.parseDouble(split[1]));
                            return car;
                        }
                        return null;
                    }
                };
                registry.addConverter(converter1);

            }
        };
    }
}
