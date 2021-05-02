package com.farias.tutorialfive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TutorialFiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialFiveApplication.class, args);
	}

}
