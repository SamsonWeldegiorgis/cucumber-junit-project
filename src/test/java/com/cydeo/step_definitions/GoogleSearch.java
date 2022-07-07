package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class GoogleSearch {

    GoogleSearchPage googleSearchPage =new GoogleSearchPage();


    @When("User searches for {string} capital")
    public void user_searches_for_capital(String countryName) {
        Driver.getDriver().get("https://www.google.com/");
        googleSearchPage.searchBox.sendKeys("What is the capital of: " + countryName + Keys.ENTER);
        System.out.println("countryName = " + countryName);

    }
    @Then("User should see {string} in result")
    public void user_should_see_in_result(String capitalCity) {
        Driver.getDriver().get("https://www.google.com/");
        System.out.println("googleSearchPage.capitalText.getText() = " + googleSearchPage.capitalText.getText());
              googleSearchPage.capitalText.getText();
        BrowserUtils.waitFor(3);
            Assert.assertEquals(capitalCity, googleSearchPage.capitalText.getText());

    }
    @Then("User should be able to search for the following :")
    public void userShouldBeAbleToSearchForTheFollowing(List<String> searchKeywords) {
        Driver.getDriver().get("https://www.google.com/");
        System.out.println("SearchKeywords : " + searchKeywords);

        for (String each : searchKeywords) {
            googleSearchPage.searchBox.clear();
            googleSearchPage.searchBox.sendKeys(each + Keys.ENTER);
            BrowserUtils.waitFor(3);
            Assert.assertEquals(each + " - Google Search", Driver.getDriver().getTitle());
        }
    }

    //   @smoke
    @Given("User is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com/");
    }


    @Then("User sees apple - Google search is in the google title")
    public void userSeesAppleGoogleSearchIsInTheGoogleTitle() {
        Driver.getDriver().get("https://www.google.com/");
        Assert.assertEquals("Title verification is failed!", "apple - Google Search", Driver.getDriver().getTitle());
    }

    @Then("User sees {string} is in the google title")
    public void userSeesIsInTheGoogleTitle(String arg0) {
    }

    @When("User types {string} in the google search box and click enter")
    public void userTypesInTheGoogleSearchBoxAndClickEnter(String searchKeyword) {
        Driver.getDriver().get("https://www.google.com/");
        googleSearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);

    }

}

