package com.learn.springbootmybatis.service.impl;

import com.learn.springbootmybatis.dao.UserDao;
import com.learn.springbootmybatis.pojo.UserDomain;
import com.learn.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public int addUser(UserDomain user) {
        return userDao.insert(user);
    }
    @Override
    public List<UserDomain> findAllUser() {
        return userDao.selectUsers();
    }
}

