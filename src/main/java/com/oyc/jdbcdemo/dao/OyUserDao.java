package com.oyc.jdbcdemo.dao;

import com.oyc.jdbcdemo.entity.OyUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户dao接口,Mybatis接口
 */
@Mapper
public interface OyUserDao {
    /**
     * 获取用户列表接口
     * @return
     */
    List<OyUser> getUserList();

    /**
     * 根据用户姓名获取用户信息
     * @param name
     * @return
     */
    OyUser getUserByName(@Param("name")String name);
}
