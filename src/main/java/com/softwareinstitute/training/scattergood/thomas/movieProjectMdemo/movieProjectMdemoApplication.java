package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@RestController
@RequestMapping({"/customers", "/films", "/staff"})
public class movieProjectMdemoApplication {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private StaffRepository staffRepository;

	public static void main(String[] args) {
		SpringApplication.run(movieProjectMdemoApplication.class, args);
	}
	@GetMapping("/allcustomers")
	public @ResponseBody
	Iterable<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@GetMapping("/allfilms")
	public @ResponseBody
	Iterable<Film> getAllFilms() {
		return filmRepository.findAll();
	}

	@GetMapping("/allstaff")
	public @ResponseBody
	Iterable<Staff> getAllStaff(){
		return staffRepository.findAll();
	}

	@PostMapping("/addcustomer")
	public @ResponseBody
	String addACustomer(@RequestParam int customer_id, @RequestParam int store_id, @RequestParam String first_name, @RequestParam String last_name,
						@RequestParam String email, @RequestParam int address_id, @RequestParam String create_date) {
		Customer savedcustomer = new Customer(customer_id, store_id, first_name, last_name, email, address_id, create_date);
		customerRepository.save(savedcustomer);
		return "Saved";
	}

	@PostMapping("/addfilm")
	public @ResponseBody String addAFilm (@RequestParam int film_id, @RequestParam String title,
										  @RequestParam String description, @RequestParam int language_id,
										  @RequestParam int length) {
		Film savedfilm = new Film(film_id, title, description, language_id, length);
		filmRepository.save(savedfilm);
		return "Saved";
		}

	@PostMapping("/addstaff")
	public @ResponseBody String addStaff (@RequestParam String first_name, @RequestParam String last_name,
										  @RequestParam int address_id,@RequestParam String email,
										  @RequestParam int store_id, @RequestParam String username) {
		Staff savedstaff = new Staff(first_name, last_name, address_id,email, store_id, username);
		staffRepository.save(savedstaff);
		return "Saved";
	}

	@DeleteMapping("/deletefilm/{film_id")
	public @ResponseBody String deletefilm(@PathVariable("film id") int film_id){
		filmRepository.deleteById(film_id);
		return ("film deleted");
	}

	@DeleteMapping("deletecustomer/{customer_id")
	public @ResponseBody String deletecustomer(@PathVariable("customer id") int customer_id){
		customerRepository.deleteById(customer_id);
		return("customer deleted");
	}
}