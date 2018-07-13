package com.oyc.jdbcdemo.controller;

import com.oyc.jdbcdemo.Service.UserService;
import com.oyc.jdbcdemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author oyc
 * @Title:用户控制类
 * @Description:
 * @date 2018/7/916:13
 */
@Controller
@RequestMapping("/userJpa")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/test")
    public String test(Model model) {
        List<User> user = userService.findAll();
        model.addAttribute("users",user);
        return "user";
    }

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<User> user = userService.findAll();
        model.addAttribute("users",user);
        return "user";
    }
}
