package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;


import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class StaffTest {
    @Test
    public void testFirstName(){
        Staff teststaff = new Staff ("Jon", "Stephens", 4, "Jon.Stephens@sakilastaff.com", 2, "Jon");
        assertEquals("The staff did not have the same first name", "Jon", teststaff.getFirst_name());
    }
    @Test
    public void testLastName(){
        Staff teststaff = new Staff ("Jon", "Stephens", 4, "Jon.Stephens@sakilastaff.com", 2, "Jon");
        assertEquals("The staff did not have the same last name", "Stephens", teststaff.getLast_name());
    }
    @Test
    public void testAddress_id(){
        Staff teststaff = new Staff ("Jon", "Stephens", 4, "Jon.Stephens@sakilastaff.com", 2, "Jon");
        assertEquals("The staff did not have the same address id", 4, teststaff.getAddress_id());
    }

    @Test
    public void testEmail_id(){
        Staff teststaff = new Staff ("Jon", "Stephens", 4, "Jon.Stephens@sakilastaff.com", 2, "Jon");
        assertEquals("The staff did not have the same email address", "Jon.Stephens@sakilastaff.com", teststaff.getEmail());
    }
    @Test
    public void testStore_id(){
        Staff teststaff = new Staff ("Jon", "Stephens", 4, "Jon.Stephens@sakilastaff.com", 2, "Jon");
        assertEquals("The staff did not have the same store id", 2, teststaff.getStore_id());
    }
    @Test
    public void testUsername(){
        Staff teststaff = new Staff ("Jon", "Stephens", 4, "Jon.Stephens@sakilastaff.com", 2, "Jon");
        assertEquals("The staff did not have the same username", "Jon", teststaff.getUsername());
    }
}
