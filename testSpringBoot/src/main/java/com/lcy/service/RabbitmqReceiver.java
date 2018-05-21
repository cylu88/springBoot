package com.lcy.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * rabbitmq接收器
 */
@Component
@RabbitListener(queues = "testQueue")
public class RabbitmqReceiver {
    @RabbitHandler
    public void process(String data) {
        System.out.println("RabbitmqReceiver接收到消息: " + data);
    }
}
