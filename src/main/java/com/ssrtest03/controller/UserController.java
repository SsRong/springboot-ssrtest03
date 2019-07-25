package com.ssrtest03.controller;

import com.ssrtest03.entity.User;
import com.ssrtest03.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试mybatis整合springboot
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/insertUsers")
    public int insertUsers(String name,Integer age){
        return userService.insertUser(name, age);
    }

    @RequestMapping("/selectUsers")
    public User selectUsers(String name){
        return userService.select(name);
    }

    }
