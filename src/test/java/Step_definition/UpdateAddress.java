package Step_definition;

import Base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.UpdateAddress1;
public class UpdateAddress extends BaseTest {

    @Given("^I logged in successfully$")
    public void iLoggedInSuccessfully() {
        UpdateAddress1 page = PageFactory.initElements(driver, UpdateAddress1.class);
        page.EnterUserEmail();
        page.EnterUserPassword();
        page.ClickSigninButton();


    }

    @And("^I clicked My Addresses$")
    public void iClickedMyAddresses() {
        UpdateAddress1 page = PageFactory.initElements(driver, UpdateAddress1.class);
        page.ClickAddressLink();

    }

    @Then("^I clicked Update Address$")
    public void iClickedUpdateAddress() {
        UpdateAddress1 page = PageFactory.initElements(driver, UpdateAddress1.class);
        page.ClickUpdateLink();

    }

    @When("^I enter the new address details$")
    public void iEnterTheNewAddressDetails() throws InterruptedException {
        UpdateAddress1 page = PageFactory.initElements(driver, UpdateAddress1.class);
        page.EnterAddress();
        Thread.sleep(10000);
        page.EnterCity();
        page.SelectNewState();
        page.EnterPostcode();


    }

    @Then("^I clicked Saved button$")
    public void iClickedSavedButton() {
        UpdateAddress1 page = PageFactory.initElements(driver, UpdateAddress1.class);
        page.ClickSaveAddress();
        driver.quit();

    }
}
