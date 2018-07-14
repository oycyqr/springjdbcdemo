package com.oyc.jdbcdemo.service;

import com.oyc.jdbcdemo.entity.OyUser;

import java.util.List;

/**
 * @author oyc
 * @Title:
 * @Description:用户服务类接口
 * @date 2018/7/1414:06
 */
public interface OyUserService {
    //获取用户列表
    List<OyUser> getUserList();
    //根据用户名称获取用户详情信息
    OyUser getUserByName(String name);

}
