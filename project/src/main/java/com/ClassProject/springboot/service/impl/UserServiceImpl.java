package com.ClassProject.springboot.service.impl;

import com.ClassProject.springboot.mapper.UserMapper;
import com.ClassProject.springboot.model.User;
import com.ClassProject.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User selectByPrimaryKey(Integer uid) {
        return userMapper.selectByPrimaryKey(uid);
    }

    @Override
    public User selectByUserInfo(User user) {
        return userMapper.selectByUserInfo(user);
    }
}
