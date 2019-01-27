package com.example.mybatisrediscache.service;

import com.example.mybatisrediscache.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> selectByPrimaryKey(String id);

    int deleteByPrimaryKey(String id);

    int insertSelective(User record);

    List<User> selectByParams(User user);

    int updateByPrimaryKeySelective(User record);
}
