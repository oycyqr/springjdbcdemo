package com.oyc.jdbcdemo.controller;

import com.oyc.jdbcdemo.entity.OyUser;
import com.oyc.jdbcdemo.service.OyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author oyc
 * @Description:用户控制类
 * @date 2018/7/14 14:11
 */
@Controller
@RequestMapping("/user")
public class OyUserController {
    @Autowired
    private OyUserService oyUserService;

    /**
     * 获取用户列表信息
     */
    @RequestMapping("/list")
    public String userList(Model map){
        List<OyUser> userList = oyUserService.getUserList();
        map.addAttribute("users", userList);
        return "user";
    }
    /**
     * 根据用户名获取用户详情信息
     * @return
     */
    @RequestMapping("/byname")
    public String userByName(Model map){
        OyUser user = oyUserService.getUserByName("oyc");
        map.addAttribute("users", user);
        return "user";
    }
}
