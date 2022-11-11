package Step_definition;

import Base.BaseTest;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.CreateNewUserPage;

import java.io.IOException;

public class Common extends BaseTest {



    @Before
    public void setup() throws IOException{
        initialize();
    }

    @Given("^I am on the app homepage$")
    public void iAmOnTheAppHomepage() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
       // System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.manage().window().maximize();
    }

    @And("^I signin$")
    public void iSignin() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.ClickHomepageSignIn();
    }
}
