package com.lcy.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.atomic.AtomicInteger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContantsTest {

    @Test
    public void atomicTest(){
        AtomicInteger count = new AtomicInteger();
        System.out.println(count);
        count.incrementAndGet();
        System.out.println(count);
        count.getAndIncrement();
        System.out.println(count);
    }

    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger();
        System.out.println(count);//0
        int num = count.incrementAndGet();
        System.out.println(count+","+num);//1,1
        num = count.getAndIncrement();
        System.out.println(count+","+num);//2,1
    }
}
