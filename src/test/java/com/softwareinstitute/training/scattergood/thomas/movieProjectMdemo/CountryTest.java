package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountryTest {
    @Test
    public void testCountry_Id() {
        Country testcountry = new Country(1, "Afghanistan");
        Assertions.assertEquals(1, testcountry.getCountry_id(), "The country Id was not the same");
    }

    @Test
    public void testCountry() {
        Country testcountry = new Country(1, "Afghanistan");
        Assertions.assertEquals("Afghanistan", testcountry.getCountry(), "The country was not the same");
    }
}

