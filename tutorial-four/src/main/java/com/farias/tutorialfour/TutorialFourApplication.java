package com.farias.tutorialfour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TutorialFourApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialFourApplication.class, args);
	}

}
