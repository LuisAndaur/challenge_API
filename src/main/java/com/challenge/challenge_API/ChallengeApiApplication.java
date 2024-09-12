package com.challenge.challenge_API;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeApiApplication {

	private static final Logger logger = LoggerFactory.getLogger(ChallengeApiApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(ChallengeApiApplication.class, args);

		logger.info("Application started");
		logger.debug("Debugging information");
	}

}
