package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class movieProjectMdemoApplication {

	public static void main(String[] args) {SpringApplication.run(movieProjectMdemoApplication.class, args);}

	@GetMapping("/getMovie")
	public String movieResponse(){
		movie movie = new movie("Halloween",102, "Horror");
		return movie.getJsonObjectOfMovie();
	}
}
