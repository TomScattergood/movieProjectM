package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class memberSD {
    @Autowired
    private CustomerRepository customerRepository;

    @Given ("George Test is in the customer database")
    public void George_Test_is_in_the_customer_database(){
    //Customer testcustomer= new Customer(store_id,customer_id, first_name, last_name, email, address_id, create_date);
    }

    @When ("I ask whether George Test is a member")
    public void I_ask_whether_George_Test_is_a_member(){

    }

    @Then ("I should be told yes")
    public void I_should_be_told_yes(){

    }


}
