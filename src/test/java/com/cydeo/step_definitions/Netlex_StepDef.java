package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class Netlex_StepDef {

    @Given("I like {string}")
    public void i_like(String string) {
        System.out.println("This is from Given String Param");

    }
        @Given("I like")
        public void i_like(List<String> movieTypes){
          System.out.println("This is from Given List of StringDataTable" + movieTypes);
    }
    @When("I go to homepage")
    public void i_go_to_homepage() {

    }

    @Given("I like below favourite movie with certain type")
    public void i_like_below_favourite_movie_with_certain_type(Map<String, String> favouriteMovie) {
        System.out.println(favouriteMovie);
        System.out.println("lovelyMovie.get(\"actions\") = " + favouriteMovie.get("actions"));
        System.out.println("favouriteMovie.get(\"adventure\") = " + favouriteMovie.get("adventure"));
    }


    @Then("I should get right recommendation")
    public void i_should_get_right_recommendation() {

    }
}

