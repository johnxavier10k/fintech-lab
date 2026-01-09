package com.john.week1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController; 

@SpringBootApplication
@RestController
public class Week1Application {

	public static void main(String[] args) {
		SpringApplication.run(Week1Application.class, args);
	}


@GetMapping("/") 
public String index() { 
	return "Greetings from MIT-FIS !"; }
}
