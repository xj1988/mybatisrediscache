package com.example.mybatisrediscache.mapper;

import com.example.mybatisrediscache.pojo.User;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> selectByPrimaryKey(String id);

    int deleteByPrimaryKey(String id);

    int insertSelective(User record);

    List<User> selectByParams(User user);

    int updateByPrimaryKeySelective(User record);
}
