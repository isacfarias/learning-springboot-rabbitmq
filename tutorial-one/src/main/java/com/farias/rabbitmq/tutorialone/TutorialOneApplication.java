package com.farias.rabbitmq.tutorialone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TutorialOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialOneApplication.class, args);
	}

}
