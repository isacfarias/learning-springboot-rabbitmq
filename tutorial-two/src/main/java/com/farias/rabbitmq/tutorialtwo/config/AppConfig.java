package com.farias.rabbitmq.tutorialtwo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.farias.rabbitmq.tutorialtwo.receiver.TutorialTwoReceiver;

@Configuration
public class AppConfig {
	

    @Bean
    public Queue hello() {
        return new Queue("hello");
    }

    @Bean
    public TutorialTwoReceiver receiverOne() {
        return new TutorialTwoReceiver(1);
    }
    
    @Bean
    public TutorialTwoReceiver receiverTwo() {
        return new TutorialTwoReceiver(2);
    }

}
