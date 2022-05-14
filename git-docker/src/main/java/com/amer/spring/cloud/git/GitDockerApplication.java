package com.amer.spring.cloud.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitDockerApplication {

	
	@GetMapping("/")
	public String message()
	{
		return " hello in git and docker version 1 " ;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GitDockerApplication.class, args);
	}

}
