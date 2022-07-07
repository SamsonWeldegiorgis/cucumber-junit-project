package com.cydeo.tests;

import com.cydeo.pages.UsingVytrackPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehicleLogin {


    @Test
    public void login_test () throws InterruptedException {
        // get the link
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
        // getting pom.xml file,,,page
        UsingVytrackPage usingVytrackPage = new UsingVytrackPage();
        // accessing and self entering the page
        usingVytrackPage.userName.sendKeys("user7");
        usingVytrackPage.password.sendKeys("UserUser123");
        usingVytrackPage.submit.click();


        //fleet
        WebElement fleetClick = Driver.getDriver().findElement(By.xpath("(//span[@class=\"title title-level-1\"])[1]"));
        fleetClick.click();

        Thread.sleep(1000);
        // Vehicle
        WebElement vehicles =  Driver.getDriver().findElement(By.xpath("//span[.=\"Vehicles\"]"));
        vehicles.click();

        // click export grid
//        Thread.sleep(5000);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs("<title>Car - Entities - System - Car - Entities - System</title>"));

        WebElement exportGrid = Driver.getDriver().findElement(By.xpath("(//a[@href=\"#\"])[11]"));
        exportGrid.click();

        Thread.sleep(3000);
        WebElement refreshBtn = Driver.getDriver().findElement(By.xpath("//i[@class=\"fa-repeat\"]"));
        refreshBtn.click();

        Thread.sleep(3000);
        WebElement resetBtn = Driver.getDriver().findElement(By.xpath("(//i[@class=\"fa-refresh\"])[2]"));
        resetBtn.click();

        Thread.sleep(3000);
        WebElement settingBtn = Driver.getDriver().findElement(By.xpath("(//i[@class=\"fa-cog hide-text\"])"));
        settingBtn.click();     //div[@class="column-manager-table"]

        Thread.sleep(3000);
        WebElement gridSetting = Driver.getDriver().findElement(By.xpath("//div[@class=\"column-manager-table\"]"));
        gridSetting.click();

//        Thread.sleep(3000);
//        WebElement allclicked = Driver.getDriver().findElement(By.xpath("(//a[@href=\"#\"])[17]"));
//        allclicked.click();

        Thread.sleep(3000);
        WebElement allSelected = Driver.getDriver().findElement(By.xpath("(//a[@href=\"#\"])[18]"));
        allSelected.click();   // all

        // Refresh button should be on the left side of Reset button

//        WebElement resetBtnBtn = Driver.getDriver().findElement(By.xpath("(//i[@class=\"fa-refresh\"])[2]"));
//        WebElement refreshBtnBtn = Driver.getDriver().findElement(By.xpath("//a[@title=\"Refresh\"]"));
//        WebElement moss = Driver.getDriver().findElement(RelativeLocator.withTagName(By.xpath("//i[@class=\"fa-refresh\"])[2]"))).click();
//        WebElement refreshToReset = Driver.getDriver().findElement(By.xpath("(//a[@title=\"Filters\"]//following-sibling::a)[1]"));

        // Refresh button should be on the left side of Reset button

        WebElement refreshToResetBetter = Driver.getDriver().findElement(By.xpath("(//a[@title=\"Refresh\"]//following-sibling::a)[1]"));
        WebElement resetToRefreshBetter = Driver.getDriver().findElement(By.xpath("(//a[@title=\"Reset\"]//preceding-sibling::a)[2]"));

        System.out.println("refreshToResetBetter.isDisplayed() = " + refreshToResetBetter.isDisplayed());
        System.out.println("resetToRefreshBetter.isDisplayed() = " + resetToRefreshBetter.isDisplayed());

    }
}
