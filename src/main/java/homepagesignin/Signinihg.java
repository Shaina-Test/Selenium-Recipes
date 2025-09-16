package homepagesignin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signinihg {

    private WebDriver driver;

    private By clicksignin = By.linkText("Sign in / Join for free");
    private By loginpage = By.name("username");

    public Signinihg(WebDriver driver){
        this.driver = driver;
    }

    public void clicksigninlink(){
        WebElement clicksign = driver.findElement(clicksignin);
        clicksign.click();
    }

    public boolean loginpageopen(){
        return driver.findElement(loginpage).isDisplayed();
    }



}

