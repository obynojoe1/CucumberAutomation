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

 public class Invalid_Login1 extends BaseTest {
   // public WebDriver driver;
   //@Given("^I am on the landing page$")
  // public void iAmOnTheLandingPage() {
   //     System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
     //   driver = new ChromeDriver();
      //  driver.manage().window().maximize();
      //  driver.navigate().to("http://automationpractice.com/index.php");}

   // @When("^I select the sign in link$")
   // public void iSelectTheSignInLink() {
     //   driver.findElement(By.className("login")).click();}

    @And("^I enter correct username$")
    public void iEnterCorrectUsername() {
        driver.findElement(By.name("email")).sendKeys("lanre_april@gmail.com");
    }

    @And("^I enter incorrect password$")
    public void iEnterIncorrectPassword() {
        driver.findElement(By.id("passwd")).sendKeys("test101");
    }

    @When("^I click login Button$")
    public void iClickLoginButton() {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
    }

    @Then("^I should get the correct error message$")
    public void iShouldGetTheCorrectErrorMessage() {
        String ExpectedErrorMessage = "Authentication failed.";
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);
        driver.quit();
    }
}
