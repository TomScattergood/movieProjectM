package com.softwareinstitute.training.scattergood.thomas.movieProjectMdemo;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/cucumber",
        glue = "src/test/java/com/softwareinstitute/training/scattergood/thomas/movieProjectMdemo")
class RunCucumberTest {

    public class CucumberRunnerClass {
    }
}
