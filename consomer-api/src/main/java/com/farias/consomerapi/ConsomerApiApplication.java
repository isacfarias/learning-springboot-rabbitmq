package com.farias.consomerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;

@EnableWebSocket
@EnableWebSocketMessageBroker
@SpringBootApplication
public class ConsomerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsomerApiApplication.class, args);
	}

}
