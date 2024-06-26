package com.example.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);

	}

		@GetMapping("/hello")
		public String hello(@RequestParam(value = "name", defaultValue = "world") String name){
			System.out.println("Hello Shankar");
			return String.format("Hello %s!", name);
			
		}


}
