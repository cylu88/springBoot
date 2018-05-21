package com.lcy.controller;

import com.lcy.model.UserDTO;
import com.lcy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8088/v1/test
 * http://localhost:8088/testSpringBoot/v1/test
 *
 * @Controller 返回一个页面的代称
 * @RestController 返回的是JSON数据
 */
@RestController
@RequestMapping("/v1")
public class TestRestController {

    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public String test(){
        UserDTO user = userService.query(2L);
        System.out.println("查询结果:"+user);
        return "hello";
    }

    @RequestMapping("/query")
    public UserDTO query(@RequestParam("id") Long userId){
        UserDTO user = userService.query(userId);
        System.out.println("查询结果:"+user);
        return user;
    }
    @RequestMapping("/query2/{id}")
    public UserDTO query2(@PathVariable("id") Long id){
        UserDTO user = userService.query(id);
        System.out.println("查询结果:"+user);
        return user;
    }
}
