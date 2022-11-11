package Step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.CreateNewUserPage;

public class New_User {
    public WebDriver driver;
    @Given("^I get on the homescreen$")
    public void iGetOnTheHomescreen() {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @When("^I get on the Login screen$")
    public void iGetOnTheLoginScreen() {
       // driver.findElement(By.linkText("Sign in")).click();
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.ClickHomepageSignIn();
    }

    //code to generate multiple emails
    @And("^I enter email address for new account$")
    public void iEnterEmailAddressForNewAccount() {
       // random = 100 + (int) (Math.random()*(1000-1)+1);
       // driver.findElement(By.id("email_create")).sendKeys("obynojoe" + random + "@gmail.com");
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.EnterNewUserEmail();
    }

    @And("^I click the create account button$")
    public void iClickTheCreateAccountButton() throws InterruptedException {
       // driver.findElement(By.id("SubmitCreate")).click();
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.ClickCreateAccountButton();
        Thread.sleep(2000);
    }

    @When("^I enter all required details$")
    public void iEnterAllRequiredDetails() {
        // driver.findElement(By.id("id_gender1")).click();
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.ClickMaleGender();

       // driver.findElement(By.id("customer_firstname")).sendKeys("Obinna");
        page.EnterFirstname();

      //  driver.findElement(By.id("customer_lastname")).sendKeys("Joseph");
        page.EnterLastName();

        //driver.findElement(By.id("passwd")).sendKeys("jagasky");
        page.EnterPassWord();

        //Select day = new Select(driver.findElement(By.id("days")));
       // day.selectByIndex(24);
        page.SelectDay();

       // Select month = new Select(driver.findElement(By.id("months")));
        // month.selectByValue( "3");
        page.SelectMonth();

        //Select year = new Select(driver.findElement(By.id("years")));
        //year.selectByValue("1987");
        page.SelectYear();

       // driver.findElement(By.id("optin")).click();
        page.ClickOption();

        //driver.findElement(By.id("address1")).sendKeys("Isolinankatu 3 ");
        page.EnterUserAddress();

        //driver.findElement(By.id("city")).sendKeys("Chicago");
        page.EnterUserCity();

        //Select state = new Select(driver.findElement(By.id("id_state")));
        //state.selectByIndex(5);
        page.SelectState();

       // driver.findElement(By.id("postcode")).sendKeys("00000");
        page.EnterPostCode();

        //driver.findElement(By.id("phone_mobile")).sendKeys("020876845");
        page.EnterPhoneMobile();

       // driver.findElement(By.id("alias")).sendKeys("alakurmanama 22");
        page.EnterAlias();


    }

    @And("^I click the register button$")
    public void iClickTheRegisterButton() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        //  driver.findElement(By.id("submitAccount")).click();
     //   driver.findElement(By.xpath("//span[text() = 'Register']")).click();
        page.ClickRegisterButton();
    }

    @Then("^My account should be successfully created$")
    public void myAccountShouldBeSuccessfullyCreated() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.AssertUserLoggedIn();


    }
}
