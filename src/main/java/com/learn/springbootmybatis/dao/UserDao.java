package com.learn.springbootmybatis.dao;

import com.learn.springbootmybatis.pojo.UserDomain;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserDao {
    int insert(UserDomain record);

    List<UserDomain> selectUsers();
}
