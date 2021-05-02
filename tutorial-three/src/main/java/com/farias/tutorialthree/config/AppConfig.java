package com.farias.tutorialthree.config;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.farias.tutorialthree.sender.TutorialThreeSender;

@Configuration
public class AppConfig {
	
	@Bean
	public FanoutExchange fanout() {
		return new FanoutExchange("tut.fanout");
	}

    @Bean
    public TutorialThreeSender sender() {
        return new TutorialThreeSender();
    }

}
