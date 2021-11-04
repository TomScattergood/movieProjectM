package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.springframework.test.util.AssertionErrors.assertEquals;

public class CustomerTest {
    @Test
    public void testStore_id(){
        Customer testcustomer = new Customer(1, 1, "Mary", "Smith", "MARY.SMITH@sakilacustomer.org", 5, "2006-02-14 22:04:36");
        Assertions.assertEquals( 1, testcustomer.getStore_id(), "The customer did not have the same store id");
    }
    @Test
    public void testCustomer_id(){
        Customer testcustomer = new Customer(1, 1, "Mary", "Smith", "MARY.SMITH@sakilacustomer.org", 5, "2006-02-14 22:04:36");
        Assertions.assertEquals(1, testcustomer.getCustomer_id(), "The customer did not have the same customer id");
    }
    @Test
    public void testFirstName(){
        Customer testcustomer = new Customer(1, 1, "Mary", "Smith", "MARY.SMITH@sakilacustomer.org", 5, "2006-02-14 22:04:36");
        Assertions.assertEquals("Mary", testcustomer.getFirst_name(), "The customer did not have the same first name");
    }
    @Test
    public void testLastName(){
        Customer testcustomer = new Customer(1, 1, "Mary", "Smith", "MARY.SMITH@sakilacustomer.org", 5, "2006-02-14 22:04:36");
        Assertions.assertEquals("Smith", testcustomer.getLast_name(), "The customer did not have the same last name");
    }
    @Test
    public void testEmail(){
        Customer testcustomer = new Customer(1, 1, "Mary", "Smith", "MARY.SMITH@sakilacustomer.org", 5, "2006-02-14 22:04:36");
        Assertions.assertEquals("MARY.SMITH@sakilacustomer.org", testcustomer.getEmail(), "The customer did not have the same email");
    }
    @Test
    public void testAddress_id(){
        Customer testcustomer = new Customer(1, 1, "Mary", "Smith", "MARY.SMITH@sakilacustomer.org", 5, "2006-02-14 22:04:36");
        Assertions.assertEquals(5, testcustomer.getAddress_id(), "The customer did not have the same address id");
    }
    @Test
    public void testCreateDate(){
        Customer testcustomer = new Customer(1, 1, "Mary", "Smith", "MARY.SMITH@sakilacustomer.org", 5, "2006-02-14 22:04:36");
        Assertions.assertEquals("2006-02-14 22:04:36", testcustomer.getCreate_date(), "The customer did not have the same create date");
    }
}
