package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;

public class memberSD {
    Customer newCustomer;
    Boolean isinDatabase=false;

    @Autowired
    private CustomerRepository customerRepository;

    @Given ("George Test is in the customer database")
    public void George_Test_is_in_the_customer_database(){
        newCustomer = new Customer(608, 1, "George", "Test", "George.Test@sakilacustomer.org", 550, "2021-11-05 17:11:19");
        customerRepository.save(newCustomer);
    }

    @When ("I ask whether George Test is a member")
    public void I_ask_whether_George_Test_is_a_member(){
    // Use functionallity to search entire database, if member is found then make boolean true
    }

    @Then ("I should be told yes")
    public void I_should_be_told_yes(){
    assertTrue(isinDatabase);
    }


    @Given("George Test is not in the customer database")
    public void georgeTestIsNotInTheCustomerDatabase() {
        
    }

    @Then("I should be told no")
    public void iShouldBeToldNo() {
    }
}
