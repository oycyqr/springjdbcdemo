package com.oyc.jdbcdemo.Service;

import com.oyc.jdbcdemo.entity.User;

import java.util.List;

/**
 * @author oyc
 * @Title:
 * @Description:
 * @date 2018/7/916:20
 */
public interface  UserService {

        User findById(String id);

        List<User> findAll();

        User save(User User);

        void delete(String id);

        List<User> findByName(String name);

        User findByUserName(String name);

        List<User> findByNameLike(String name);

        User findByNameAndPassword(String name, String password);

        User findByNameAndPasswordRetry(String name, String password);

        boolean update(User User);

        Long findUserTotalNum();

}
