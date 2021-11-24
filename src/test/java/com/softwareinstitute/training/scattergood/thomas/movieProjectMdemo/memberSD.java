package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

public class memberSD {
    int searchId;
    Customer newCustomer;
    Boolean isinDatabase=false;

    @Autowired
    private Optional<Customer> response;
    private CustomerRepository customerRepositoryInstanceForTests;

    @Given("The customer with id {int} is in the customer database")
    public void theCustomerWithIdIsInTheCustomerDatabase(int customer_id) {
        searchId = 1;
    }


    @When("I ask whether the customer with id {int} is in the customer database")
    public void iAskWhetherTheCustomerWithIdIsInTheCustomerDatabase(int customer_id) {
        response = customerRepositoryInstanceForTests.findById(customer_id);
    }

    @Then("I should see customer info")
    public void iShouldSeeCustomerInfo() {
       Customer expectedCustomer = new Customer();
        expectedCustomer.setCustomer_id(1);
        expectedCustomer.setStore_id(1);
        expectedCustomer.setFirst_name("Mary");
        expectedCustomer.setLast_name("Smith");
        expectedCustomer.setEmail("Mary.Smith@sakilacustomer.org");
        expectedCustomer.setAddress_id(5);
        expectedCustomer.setCreate_date("2006-02-17 22:04:36");
        Optional<Customer> actualCustomerList = customerRepositoryInstanceForTests.findById(searchId);
        Customer actualCustomer = actualCustomerList.get();
        assertEquals(actualCustomer, expectedCustomer);
    }


    @Given("Mary Smith is not in the customer database")
    public void MarySmithIsNotInTheCustomerDatabase() {
        
    }

    @Then("I should be told no")
    public void iShouldBeToldNo() {
    }



}
