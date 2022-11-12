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


public class Valid_Login extends BaseTest {
   // public WebDriver driver;

     //  @Given("^I am on the homepage$")
    //public void iSmOnTheHomepage() {
    //System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    //driver = new ChromeDriver();
    //driver.manage().window().maximize();
    //driver.navigate().to("http://automationpractice.com/index.php");}

  //  @When("^I click the signin Button$")
    //public void iClickTheSigninButton() {
      //  driver.findElement(By.linkText("Sign in")).click(); }

    @And("^I enter valid username$")
    public void iEnterValidUsername()
    {
        driver.findElement(By.name("email")).sendKeys("lanre_april@gmail.com");
    }

    @And("^I enter valid password$")
    public void iEnterValidPassword() {
        driver.findElement(By.id("passwd")).sendKeys("testing");

    }

    @When("^I click  on the login Button$")
    public void iClickTheLoginButton() {
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();

    }

    @Then("^I should be logged in successfully$")
    public  iShouldBeLoggedInSuccessfully() {
        String ExpectedLogInUser = "Dorice Mbonde";
        String ActualLogInUser = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assert.assertEquals(ExpectedLogInUser, ActualLogInUser);
        System.out.println(ActualLogInUser);
        driver.quit();
    }


}



