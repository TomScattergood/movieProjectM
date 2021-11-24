package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorTest {
    @Test
    public void testActor_Id(){
    Actor testactor = new Actor (3, "Ed", "Chase");
    Assertions.assertEquals(3, testactor.getActor_id(), "The Actor Id was not the same ");
    }

    @Test
    public void testFirstName(){
        Actor testactor = new Actor (3, "Ed", "Chase");
        Assertions.assertEquals("Ed", testactor.getFirst_name(), "The Actor's first name was not the same ");
    }
    @Test
    public void testLastName(){
        Actor testactor = new Actor (3, "Ed", "Chase");
        Assertions.assertEquals("Chase", testactor.getLast_name(), "The Actor's last name was not the same ");
    }
}