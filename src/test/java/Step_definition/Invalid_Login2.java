package Step_definition;

import Base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid_Login2 extends BaseTest {
   // public WebDriver driver;
   // @Given("^I get to the homepage$")
   // public void iGetToTheHomepage() {
    //    System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
     //   driver = new ChromeDriver();
      //  driver.manage().window().maximize();
     //   driver.navigate().to("http://automationpractice.com/index.php");}

  //  @And("^Press the sign in button$")
 //   public void pressTheSignInButton() {
    //    driver.findElement(By.className("login")).click();}

    @When("^I enter wrong username$")
    public void iEnterWrongUsername() {
        driver.findElement(By.name("email")).sendKeys("lanreapril2022@gmail.com");
    }

    @And("^Enter correct password$")
    public void enterCorrectPassword() {
        driver.findElement(By.id("passwd")).sendKeys("testing");
    }

    @When("^I click the Button to login$")
    public void iClickTheButtonToLogin() {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
    }

    @Then("^I should get the right error message$")
    public void iShouldGetTheRightErrorMessage() {
        String ExpectedErrorMessage = "Authentication failed.";
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);
        driver.quit();
    }
}
