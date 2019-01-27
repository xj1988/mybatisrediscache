package com.example.mybatisrediscache.service.impl;

import com.example.mybatisrediscache.mapper.UserMapper;
import com.example.mybatisrediscache.pojo.User;
import com.example.mybatisrediscache.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectByPrimaryKey(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public List<User> selectByParams(User user) {
        return userMapper.selectByParams(user);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }
}
