package com.farias.tutorialseven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TutorialSevenApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialSevenApplication.class, args);
	}

}
