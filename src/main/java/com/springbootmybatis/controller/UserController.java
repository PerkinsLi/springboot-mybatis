package com.springbootmybatis.controller;

import com.springbootmybatis.dao.UserMapper;
import com.springbootmybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Perkins
 * @Date 2018/11/5 1:35
 */
@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("user")
    public String getUser(){
        User user = userMapper.selectByPrimaryKey(13);
        return user.getUsername();
    }
}
