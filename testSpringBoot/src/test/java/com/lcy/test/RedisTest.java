package com.lcy.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    RedisTemplate redisTemplate;


    @Test
    public void add(){
        redisTemplate.opsForValue().set("name","wanglaowu");
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println("缓存值name:"+name);
    }
}
