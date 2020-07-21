package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocalizationStepDef {

    WebDriver driver;

    @Given("^User on the Welcome page of \"([^\"]*)\"$")
    public void user_on_the_Welcome_page_of(String arg1) throws Throwable {
        System.setProperty("webdriver.chrome.driver","D:\\Download\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(arg1);
    }

    @When("^User click on \"([^\"]*)\"$")
    public void user_click_on(String arg1) throws Throwable {
        driver.findElement(By.xpath("//a[@class='"+arg1+"']")).click();
    }

    @Then("^User go to home page with selected language \"([^\"]*)\"$")
    public void user_go_to_home_page_with_selected_language(String arg1) throws Throwable {
        String actual = driver.findElement(By.xpath("//a[@id='contact_link']")).getAttribute("href");
        String before = "/wrapper/wordpress/CMSWrapper/content/contactus?gen_from=abt&appcode=cp&lang=";
        String expected = before+arg1.substring(0,2);
        Assert.assertEquals(actual.substring((18)),expected);
    }

    @Then("^User close the browser$")
    public void user_close_the_browser() throws Throwable {
        driver.quit();
    }

}
