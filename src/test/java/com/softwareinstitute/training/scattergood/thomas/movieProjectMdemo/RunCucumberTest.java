package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"src/main/java/com/example/movieProjectMdemo"},
                 glue = {"com/softwareinstitute/training/scattergood/thomas/movieProjectMdemo/memberSD.java"})
public class RunCucumberTest {
}
