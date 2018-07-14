package com.oyc.jdbcdemo.service.Impl;

import com.oyc.jdbcdemo.dao.OyUserDao;
import com.oyc.jdbcdemo.entity.OyUser;
import com.oyc.jdbcdemo.service.OyUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author oyc
 * @Title:
 * @Description:
 * @date 2018/7/1414:09
 */
@Service
public class OyUserServiceImpl implements OyUserService {

    @Resource
    private OyUserDao oyUserDao;

    @Override
    public List<OyUser> getUserList() {
        return oyUserDao.getUserList();
    }

    @Override
    public OyUser getUserByName(String name) {
        return oyUserDao.getUserByName(name);
    }
}
