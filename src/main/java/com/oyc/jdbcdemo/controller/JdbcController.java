package com.oyc.jdbcdemo.controller;

import com.oyc.jdbcdemo.entity.OyUser;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author oyc
 * @Description: 用户控制类
 * @date 2018/7/8 22:10
 */
@Controller
@RequestMapping("/jdbc")
public class JdbcController {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/userlist")
    public String getUserList(ModelMap map){
        String sql = "SELECT * FROM oy_user";
        List<OyUser> userList = jdbcTemplate.query(sql, new RowMapper<OyUser>() {
            OyUser user = null;
            @Override
            public OyUser mapRow(ResultSet rs, int rowNum) throws SQLException {
                user = new OyUser();
                user.setId(rs.getString("id"));
                user.setName(rs.getString("name"));
                user.setSex(rs.getString("sex"));
                user.setAge(rs.getString("age"));
                return user;
            }});
        for(OyUser user:userList){
            System.out.println(user.getName());
        }
        map.addAttribute("users", userList);
        return "user";
    }
}
