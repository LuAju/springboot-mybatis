package com.learn.springbootmybatis.service;


import com.learn.springbootmybatis.pojo.UserDomain;
import org.springframework.stereotype.Service;

import java.util.List;



public interface UserService {

    int addUser(UserDomain user);

    List<UserDomain> findAllUser();
//    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
