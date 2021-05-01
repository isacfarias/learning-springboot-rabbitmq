package com.farias.rabbitmq.tutorialtwo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.farias.rabbitmq.tutorialtwo.receiver.TutorialTwoReceiver;

@Profile({"tutorialtwo","hello-world"})
@Configuration
public class AppConfig {
	

    @Bean
    public Queue hello() {
        return new Queue("hello");
    }

    @Profile("receiver")
    @Bean
    public TutorialTwoReceiver receiver() {
        return new TutorialTwoReceiver();
    }

}
