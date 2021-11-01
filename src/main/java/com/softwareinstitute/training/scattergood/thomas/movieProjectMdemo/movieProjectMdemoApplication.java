package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@RestController
@RequestMapping("/films")
public class movieProjectMdemoApplication {

	@Autowired
	private filmRepository filmRepository;
	public static void main(String[] args) {SpringApplication.run(movieProjectMdemoApplication.class, args);}

	@GetMapping("/all")
	public @ResponseBody Iterable <film> getAllUsers(){
		return filmRepository.findAll();
	}

	@PostMapping("/addfilm")
	public @ResponseBody String addAFilm (@RequestParam String title, @RequestParam int length,
										  @RequestParam double replacement_cost, @RequestParam int rental_rate) {

		film savedfilm = new film(title, length, replacement_cost, rental_rate);
		filmRepository.save(savedfilm);
		return "Saved";
	}

	/*{
		film film = new film("Halloween",102, "Horror", 4.99);
		return film.getJsonObjectOffilm();
	}*/
}
