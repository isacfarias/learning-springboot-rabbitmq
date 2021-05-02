package com.farias.tutorialseven.config;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.farias.tutorialseven.sender.TutorialSevenSender;

@Configuration
public class AppConfig {
	
	@Bean
	public TopicExchange topic() {
		return new TopicExchange("tut.topic");
	}

    @Bean
    public TutorialSevenSender sender() {
        return new TutorialSevenSender();
    }

}
