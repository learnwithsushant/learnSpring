package com.crudsample.UdemyCrudWorks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UdemyCrudWorksApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyCrudWorksApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String args[]){
		return commandLineRunner -> {
			System.out.println("I am askilled Developer !");
		};
	}

}
