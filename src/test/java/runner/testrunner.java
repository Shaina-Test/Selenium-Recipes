package runner;

import io.cucumber.testng.CucumberOptions;

 @CucumberOptions(features = "src/test/resources/features",
        glue = "com.qa.homestepdef",
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
         monochrome = true
 )
 public class testrunner {

}
