package com.lcy.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/v1")
public class RabbitController {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RequestMapping("/send")
    public String  sendMq(){
        String sendMsg = "hello1 " + new Date();
        System.out.println("Sender1 : " + sendMsg);
        this.rabbitTemplate.convertAndSend("testQueue", sendMsg);
        return "消息发送成功";
    }
}
