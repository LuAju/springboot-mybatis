package com.learn.springbootmybatis.controller;

import com.learn.springbootmybatis.pojo.UserDomain;
import com.learn.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("getAll")
    public List<UserDomain> getAllUsers(){
        return userService.findAllUser();
    }
}