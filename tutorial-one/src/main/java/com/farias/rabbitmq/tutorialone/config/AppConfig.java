package com.farias.rabbitmq.tutorialone.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.farias.rabbitmq.tutorialone.sender.TutorialOneSender;

@Profile({"tutorialone","hello-world"})
@Configuration
public class AppConfig {

    @Bean
    public Queue hello() {
        return new Queue("hello");
    }

    @Profile("sender")
    @Bean
    public TutorialOneSender sender() {
        return new TutorialOneSender();
    }

}
