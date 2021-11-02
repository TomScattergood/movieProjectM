package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@RestController
@RequestMapping({"/films", "/customers"})
public class movieProjectMdemoApplication {

	@Autowired
	private customerRepository customerRepository;
	@Autowired
	private filmRepository filmRepository;

	public static void main(String[] args) {
		SpringApplication.run(movieProjectMdemoApplication.class, args);
	}


	@GetMapping("/allcustomers")
	public @ResponseBody
	Iterable<customer> getAllUsers() {
		return customerRepository.findAll();
	}
	@GetMapping("/allfilms")
	public @ResponseBody
	Iterable<film> getAllFilms() {
		return filmRepository.findAll();
	}

	@PostMapping("/addcustomer")
	public @ResponseBody
	String addACustomer(@RequestParam int customer_id, @RequestParam int store_id, @RequestParam String first_name,
						@RequestParam String last_name, @RequestParam int address_id) {
		customer savedcustomer = new customer(customer_id, store_id, first_name, last_name, address_id);
		customerRepository.save(savedcustomer);
		return "Saved";
	}

	@PostMapping("/addfilm")
	public @ResponseBody String addAFilm (@RequestParam String title, @RequestParam String description, @RequestParam int release_year, @RequestParam int rental_duration,
										  @RequestParam double rental_rate, @RequestParam int length, @RequestParam double replacement_cost) {

		film savedfilm = new film(title, description, release_year, rental_duration, rental_rate, length, replacement_cost);
		filmRepository.save(savedfilm);
		return "Saved";
		}
}