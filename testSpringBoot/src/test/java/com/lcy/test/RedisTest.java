package com.lcy.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

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

    @Test
    public void testHashMap(){
        String key = "hash";
        HashOperations opsForHash = redisTemplate.opsForHash();
//        redisTemplate.boundHashOps("hash").put("name","tom");

        opsForHash.put(key,"name","tom");

        System.out.println(opsForHash.get(key,"name"));
    }

    @Test
    public void brpop(){
        redisTemplate.opsForList().rightPop("list", 5, TimeUnit.SECONDS);
    }
}
