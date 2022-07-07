package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableOrderPage12 extends BasePage {

 public WebTableOrderPage12() {
  PageFactory.initElements(Driver.getDriver(), this);
 }

 @FindBy(name = "username")
 public WebElement inputUsername;

 @FindBy(name = "password")
 public WebElement inputPassword;

 @FindBy(xpath = "//button[@type=\"submit\"]")
 public WebElement submit;

 public void loginpls(String username, String password) {
  inputUsername.sendKeys(username);
  inputPassword.sendKeys(password);
  submit.click();
 }
}


