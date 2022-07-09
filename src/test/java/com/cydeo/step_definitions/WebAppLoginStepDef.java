package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebAppLoginStepDef {


    WebTableLoginPage webTableLoginPage =new WebTableLoginPage();


    @When("user entersss below credentials")
    public void user_entersss_below_credentials(Map<String,String> credentials) {

        webTableLoginPage.login(credentials.get("username"),credentials.get("password"));
        BrowserUtils.waitFor(3);
    }



    @When("user enters username {string} , password {string} and login")
    public void user_enters_username_password_and_login(String username, String password) {
        webTableLoginPage.login(username,password);
        BrowserUtils.waitFor(3);
    }


    @Given("user is in web table login page")
    public void user_is_in_web_table_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));
        BrowserUtils.waitFor(3);
    }

    @When("user enters username {string}")
    public void user_enters_username(String username) {
        webTableLoginPage.inputUserName.sendKeys(username);
        BrowserUtils.waitFor(3);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        webTableLoginPage.inputPassword.sendKeys(password);
        BrowserUtils.waitFor(3);
    }

    @And("user click login button1")
    public void userClickLoginButton1() {
        webTableLoginPage.loginBtn.click();
        BrowserUtils.waitFor(3);
    }

    @When("user enters username1 {string}")
    public void user_enters_username1(String username) {
        webTableLoginPage.inputUserName.sendKeys(username);
        BrowserUtils.waitFor(3);
    }
    @When("user enters password1 {string}")
    public void user_enters_password1(String password) {
        webTableLoginPage.inputPassword.sendKeys(password);
        BrowserUtils.waitFor(3);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        webTableLoginPage.loginBtn.click();
        BrowserUtils.waitFor(3);
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }


    @When("user enters below credentialss")
    public void userEntersBelowCredentialss(Map<String,String> credentials) {

            webTableLoginPage.login(credentials.get("username"),credentials.get("password"));
            BrowserUtils.waitFor(3);
    }
}