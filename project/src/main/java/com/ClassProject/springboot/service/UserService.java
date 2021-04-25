package com.ClassProject.springboot.service;


import com.ClassProject.springboot.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User selectByPrimaryKey(Integer uid);

    User selectByUserInfo(User user);
}
