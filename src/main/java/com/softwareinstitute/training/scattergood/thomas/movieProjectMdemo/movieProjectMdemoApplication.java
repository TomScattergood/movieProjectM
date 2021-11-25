package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
// jenkins comment test
@SpringBootApplication
@RestController
@RequestMapping({"/customers", "/countries", "/actors"})
public class movieProjectMdemoApplication {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CountryRepository countryRepository;
	@Autowired
	private ActorRepository actorRepository;

	/*@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private StaffRepository staffRepository;*/

	public static void main(String[] args) {
		SpringApplication.run(movieProjectMdemoApplication.class, args);
	}
	@GetMapping("/allcustomers")
	public @ResponseBody
	Iterable<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@GetMapping("/{customer_id}")
	public @ResponseBody
	Optional<Customer> FindCustomer_id(@PathVariable int customer_id){
		return customerRepository.findById(customer_id);
	}

    @PostMapping("/addcustomer")
    public @ResponseBody
    String addACustomer(@RequestParam int customer_id, @RequestParam int store_id, String first_name, @RequestParam String last_name,
                        @RequestParam String email, @RequestParam int address_id, @RequestParam String create_date) {
        Customer savedcustomer = new Customer(customer_id, store_id, first_name, last_name, email, address_id, create_date);
        customerRepository.save(savedcustomer);
        return "Saved";
    }

    @DeleteMapping("deletecustomer/{customer_id}")
    public @ResponseBody String deletecustomer(@PathVariable("customer id") int customer_id){
        customerRepository.deleteById(customer_id);
        return("customer deleted");
    }


    @GetMapping("/allcountries")
	public @ResponseBody
	Iterable<Country> getAllCountries(){
		return countryRepository.findAll();
	}

    // can only use one find by id at a time
    /*@GetMapping("/{country_id}")
    public @ResponseBody
    Optional<Country> FindCountryId(@PathVariable("country_id") int country_id){
        return countryRepository.findById(country_id);
}*/


    @PostMapping("/addcountry")
    public @ResponseBody
    String addACountry(@RequestParam int country_id, @RequestParam String country) {
        Country savedcountry = new Country(country_id, country);
        countryRepository.save(savedcountry);
        return "Country Saved";
    }

    @DeleteMapping("/deletecountry")
    public @ResponseBody
            String deletecountry(@RequestParam int country_id) {
        countryRepository.deleteById(country_id);
        return("country deleted");
    }
    @CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/allactors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
		return actorRepository.findAll();
	}

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/addactor")
    public
    ResponseEntity<Actor> addAnActor(@RequestBody Actor newactor) {
        Actor savedactor = new Actor(newactor.getActor_id(), newactor.getFirst_name(), newactor.getLast_name());
        actorRepository.save(savedactor);
        return new ResponseEntity<Actor>(savedactor, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/deleteactor/{actor_id}")
    public @ResponseBody
    String deleteactor(@PathVariable("actor_id") int actor_id) {
        actorRepository.deleteById (actor_id);
        return("actor deleted");
    }
    /*@GetMapping("/{actor_id}")
	public @ResponseBody
	Optional<Actor> FindActorId(@PathVariable("actor_id") int actor_id){
		return actorRepository.findById(actor_id);
	}

	@GetMapping("/allstaff")
	public @ResponseBody
	Iterable<Staff> getAllStaff(){
		return staffRepository.findAll();
	}		*/



	/*@PostMapping("/addfilm")
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

	@DeleteMapping("/deletefilm/{film_id}")
	public @ResponseBody String deletefilm(@PathVariable("film id") int film_id){
		filmRepository.deleteById(film_id);
		return ("film deleted");
	}		*/


}