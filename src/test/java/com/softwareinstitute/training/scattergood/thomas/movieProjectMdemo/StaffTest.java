package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StaffTest {
    @Test
    public void testFirstName(){
        Staff teststaff = new Staff ("Jon", "Stephens", 4, "Jon.Stephens@sakilastaff.com", 2, "Jon");
        Assertions.assertEquals("Jon", teststaff.getFirst_name(), "The staff did not have the same first name");
    }
    @Test
    public void testLastName(){
        Staff teststaff = new Staff ("Jon", "Stephens", 4, "Jon.Stephens@sakilastaff.com", 2, "Jon");
        Assertions.assertEquals("Stephens", teststaff.getLast_name(), "The staff did not have the same last name");
    }
    @Test
    public void testAddress_id(){
        Staff teststaff = new Staff ("Jon", "Stephens", 4, "Jon.Stephens@sakilastaff.com", 2, "Jon");
        Assertions.assertEquals(4, teststaff.getAddress_id(), "The staff did not have the same address id");
    }

    @Test
    public void testEmail_id(){
        Staff teststaff = new Staff ("Jon", "Stephens", 4, "Jon.Stephens@sakilastaff.com", 2, "Jon");
        Assertions.assertEquals("Jon.Stephens@sakilastaff.com", teststaff.getEmail(),"The staff did not have the same email address");
    }
    @Test
    public void testStore_id(){
        Staff teststaff = new Staff ("Jon", "Stephens", 4, "Jon.Stephens@sakilastaff.com", 2, "Jon");
        Assertions.assertEquals(2, teststaff.getStore_id(), "The staff did not have the same store id");
    }
    @Test
    public void testUsername(){
        Staff teststaff = new Staff ("Jon", "Stephens", 4, "Jon.Stephens@sakilastaff.com", 2, "Jon");
        Assertions.assertEquals("Jon", teststaff.getUsername(), "The staff did not have the same username");
    }
    @Test
    public void testSetFirst(){
        Staff teststaff = new Staff();
        teststaff.setFirst_name("Thomas");
        Assertions.assertEquals("Thomas", teststaff.getFirst_name(), "The staff did not have the same first name");
    }
}
