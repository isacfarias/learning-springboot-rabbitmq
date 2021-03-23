package com.farias.consomerapi.config;

import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

public class PessoaWebSocketConfiguration implements WebSocketMessageBrokerConfigurer {
	
	 public static final String BROKER = "pessoaCreated";

	    @Override
	    public void registerStompEndpoints(StompEndpointRegistry registry) {
	        registry.addEndpoint("/socket")
	                .setAllowedOrigins("*")
	                .withSockJS();
	    }

	    @Override
	    public void configureMessageBroker(MessageBrokerRegistry registry) {
	        registry.enableSimpleBroker(BROKER);
	    }
}
