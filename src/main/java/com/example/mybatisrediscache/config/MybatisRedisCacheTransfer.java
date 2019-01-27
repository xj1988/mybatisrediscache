package com.example.mybatisrediscache.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class MybatisRedisCacheTransfer {

    @Autowired
    public void setRedisTemplate(RedisTemplate redisTemplate) {
        MybatisRedisCache.setRedisTemplate(redisTemplate);
    }

}
