package com.oyc.jdbcdemo.Service.Impl;

import com.oyc.jdbcdemo.Service.UserService;
import com.oyc.jdbcdemo.dao.UserMyRepository;
import com.oyc.jdbcdemo.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author oyc
 * @Title:
 * @Description:
 * @date 2018/7/916:22
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMyRepository userRepository;

    @Override
    public User findById(String id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> findAll() {
        List<User> userList = userRepository.findAll();
        return userList;
    }

    @Override
    public User save(User User) {
        User saveUser =  userRepository.save(User);
        return saveUser;
    }

    @Override
    public void delete(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public List <User> findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public User findByUserName(String name) {
        return null;
    }

    @Override
    public List <User> findByNameLike(String name) {
        return userRepository.findByNameLike(name);
    }

    @Override
    public User findByNameAndPassword(String name, String password) {
        return null;
    }

    @Override
    public User findByNameAndPasswordRetry(String name, String password) {
        return null;
    }

    @Override
    public boolean update(User User) {
        User user = userRepository.save(User);
        if(user == null){
            //更新失败
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override
    public Long findUserTotalNum() {
        return Long.valueOf(userRepository.findAll().size());
    }
}
