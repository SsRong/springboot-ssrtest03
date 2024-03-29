package com.ssrtest03.service;

import com.ssrtest03.entity.User;
import com.ssrtest03.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User select(String name){
        User selectResult = userMapper.findByName(name);
        log.info("#######insertUserResult:{}#############",selectResult);
        return selectResult;
    }

    @Transactional
    public int insertUser(String name,Integer age){
        int insertUserResult = userMapper.insert(name, age);
        int i = 1/age;
        log.info("#######insertUserResult:{}#############",insertUserResult);
        return insertUserResult;
    }


}
