package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

 @CucumberOptions(features = "src/test/resources/features",
        glue = {"com.qa.homestepdef"},
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
public class testrunner {
}
