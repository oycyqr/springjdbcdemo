package com.oyc.jdbcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author oyc
 * @Title:
 * @Description:
 * @date 2018/7/821:10
 */
@Controller
@RequestMapping("/hello")
public class HelloSpringboot {

    @RequestMapping("/springboot")
    public String helloSpringBoot(ModelMap map){
        System.out.println("Hello SpringBoot!");
        map.addAttribute("hellosb", "Hello SpringBoot!");
        return "index";
    }
}
