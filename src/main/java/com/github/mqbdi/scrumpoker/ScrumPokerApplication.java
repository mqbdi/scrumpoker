package com.github.mqbdi.scrumpoker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EnableAutoConfiguration
@Slf4j
@EnableWebMvc
public class ScrumPokerApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(ScrumPokerApplication.class);
		log.debug("Scrum Poker starting ...");
		springApplication.run(args);
	}

}
