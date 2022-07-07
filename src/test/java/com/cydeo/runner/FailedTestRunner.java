package com.cydeo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "@target/rerun.txt",     // @ determines your target folder
        glue = "com/cydeo/step_definitions" // running our tests,the step def location( determines the running stpdef)
                          // rerun is to rerun my failures,,,

)

public class FailedTestRunner {
}
