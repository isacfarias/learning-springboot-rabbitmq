package com.farias.rabbitmq.tutorialone.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.farias.rabbitmq.tutorialone.sender.TutorialOneSender;

@Configuration
public class AppConfig {

    @Bean
    public Queue hello() {
        return new Queue("hello");
    }

    @Bean
    public TutorialOneSender sender() {
        return new TutorialOneSender();
    }

}
