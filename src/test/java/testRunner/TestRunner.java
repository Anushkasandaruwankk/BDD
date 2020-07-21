package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Acer\\Desktop\\BDDDemo\\src\\test\\resources\\WelcomePage.feature",
        glue = "stepDefinition"
)

public class TestRunner {
}
