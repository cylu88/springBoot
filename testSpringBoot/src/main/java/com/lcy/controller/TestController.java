package com.lcy.controller;

import com.lcy.model.UserDTO;
import com.lcy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8088/v1/hello
 * http://localhost:8088/testSpringBoot/v1/hello
 *
 * @Controller 返回一个页面的代称
 * @RestController 返回的是JSON数据
 */
@Controller
@RequestMapping("/v1")
public class TestController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public String test(){
        UserDTO user = userService.query(2L);
        System.out.println("查询结果:"+user);
        return "hello";
    }
}
