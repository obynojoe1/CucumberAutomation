package Step_definition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid_Login3 {
    public WebDriver driver;
    @Given("^I land on the homepage$")
    public void iLandOnTheHomepage() {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");

    }

    @And("^I press the login$")
    public void iPressTheLogin() {
        driver.findElement(By.className("login")).click();
    }

    @When("^I type \"([^\"]*)\"$")
    public void iType(String username) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(username);

    }

    @And("^I input \"([^\"]*)\"$")
    public void iInput(String password) throws Throwable {
        driver.findElement(By.id("passwd")).sendKeys(password);
    }

    @When("^I click login$")
    public void iClickLogin() {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
    }

    @Then("^I should get correct  \"([^\"]*)\"$")
    public void iShouldGetCorrect(String error) throws Throwable {
        String ExpectedErrorMessage = error;
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);
        driver.quit();


    }
}
