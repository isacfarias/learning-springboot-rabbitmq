package com.farias.tutorialnine.config;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.farias.tutorialnine.sender.TutorialNineSender;

@Configuration
public class AppConfig {
	
	@Bean
	public DirectExchange exchage() {
		return new DirectExchange("tut.rpc");
	}

    @Bean
    public TutorialNineSender sender() {
        return new TutorialNineSender();
    }

}
