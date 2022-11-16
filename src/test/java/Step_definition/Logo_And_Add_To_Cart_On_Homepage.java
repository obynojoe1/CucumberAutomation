package Step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class Logo_And_Add_To_Cart_On_Homepage {

    public WebDriver driver;
    @Given("^I launch a browser$")
    public void i_launch_a_browser() throws Throwable {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @And("^I enter application URL$")
    public void i_enter_application_URL() throws Throwable {
        driver.navigate().to("http://automationpractice.com/index.php");

    }

    @When("^I wait for (\\d+) seconds$")
    public void i_wait_for_seconds(int arg1) throws Throwable {
        Thread.sleep(500);
    }

    @Then("^I should see the application logo and add to cart to button$")
    public void i_should_see_the_application_logo_and_add_to_cart_to_button() throws Throwable {
        driver.findElement(By.id("header_logo")).isDisplayed();
        driver.findElement(By.className("shopping_cart")).isDisplayed();
        driver.quit();

    }
}
