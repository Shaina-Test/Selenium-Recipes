package com.qa.homestepdef;

import homepagesignin.Signinihg;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homestepdefinitions {

    public WebDriver driver;
    public Signinihg signinihg;

    @Before
    public void setup(){
        driver = new ChromeDriver();
    }

    @Given("iam on home page")
    public void iam_on_home_page(){

        driver.get("https://www.ihg.com/hotels/gb/en/reservation");
        signinihg = new Signinihg(driver);
    }

    @When("i click on signin button")
    public void i_click_on_signin_button(){
        signinihg.clicksigninlink();
    }

    @Then("login page opens suucessfully")
    public void login_page_opens_suucessfully(){
        Assert.assertEquals(signinihg.loginpageopen(),true);
    }
}
