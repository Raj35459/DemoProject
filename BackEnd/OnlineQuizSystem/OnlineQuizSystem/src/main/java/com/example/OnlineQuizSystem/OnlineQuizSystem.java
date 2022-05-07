package com.example.OnlineQuizSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
public class OnlineQuizSystem {

	
	public static void main(String[] args) {
		System.out.print("Enter a string: ");   
		SpringApplication.run(OnlineQuizSystem.class, args);
		System.out.println("Hellow Worjoj");
	}

}
