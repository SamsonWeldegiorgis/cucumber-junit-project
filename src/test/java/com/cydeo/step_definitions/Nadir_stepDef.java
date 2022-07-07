package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Nadir_stepDef {

    @When("user hover the Fleet module")
    public void user_hover_the_fleet_module() {
        System.out.println("user hover the Fleet module");
    }
    @When("user Scroll down to Fleet functionalities")
    public void user_scroll_down_to_fleet_functionalities() {
        System.out.println("user Scroll down to Fleet functionalities");
    }
    @When("user click Vehicle")
    public void user_click_vehicle() {
        System.out.println("user click Vehicle");
    }
    @Then("user should be able to see all Vehicle details")
    public void user_should_be_able_to_see_all_vehicle_details() {
        System.out.println("user should be able to see all Vehicle details");
    }
}
