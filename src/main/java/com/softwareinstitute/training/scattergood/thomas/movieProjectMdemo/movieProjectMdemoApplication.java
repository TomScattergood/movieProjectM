package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@RestController
@RequestMapping({"/customers", "/films", "/staff", "/addresses"})
public class movieProjectMdemoApplication {
	@Autowired
	private customerRepository customerRepository;
	@Autowired
	private filmRepository filmRepository;
	@Autowired
	private staffRepository staffRepository;
	@Autowired
	private addressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(movieProjectMdemoApplication.class, args);
	}
	@GetMapping("/allcustomers")
	public @ResponseBody
	Iterable<customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@GetMapping("/allfilms")
	public @ResponseBody
	Iterable<film> getAllFilms() {
		return filmRepository.findAll();
	}

	@GetMapping("/allstaff")
	public @ResponseBody
	Iterable<staff> getAllStaff(){
		return staffRepository.findAll();
	}

	@GetMapping("alladdresses")
	public @ResponseBody
	Iterable<address> getAllAddresses(){return addressRepository.findAll();}

	@PostMapping("/addcustomer")
	public @ResponseBody
	String addACustomer(@RequestParam int customer_id, @RequestParam int store_id, @RequestParam String first_name, @RequestParam String last_name,
						@RequestParam String email, @RequestParam int address_id, @RequestParam String create_date) {
		customer savedcustomer = new customer(customer_id, store_id, first_name, last_name, email, address_id, create_date);
		customerRepository.save(savedcustomer);
		return "Saved";
	}

	@PostMapping("/addfilm")
	public @ResponseBody String addAFilm (@RequestParam String title, @RequestParam int release_year, @RequestParam int language_id, @RequestParam int rental_duration,
										  @RequestParam double rental_rate, @RequestParam int length, @RequestParam double replacement_cost) {
		film savedfilm = new film(title, release_year, language_id, rental_duration, rental_rate, length, replacement_cost);
		filmRepository.save(savedfilm);
		return "Saved";
		}

	@PostMapping("/addstaff")
	public @ResponseBody String addStaff (@RequestParam String first_name,
										  @RequestParam String last_name, @RequestParam int address_id,@RequestParam String email, @RequestParam int store_id, @RequestParam String username) {
		staff savedstaff = new staff (first_name, last_name, address_id,email, store_id, username);
		staffRepository.save(savedstaff);
		return "Saved";
	}
}