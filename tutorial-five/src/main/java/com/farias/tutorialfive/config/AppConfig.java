package com.farias.tutorialfive.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.farias.tutorialfive.sender.TutorialFiveSender;

@Configuration
public class AppConfig {
	
	@Bean
	public DirectExchange direct() {
		return new DirectExchange("tut.direct");
	}

    @Bean
    public TutorialFiveSender sender() {
        return new TutorialFiveSender();
    }

}
