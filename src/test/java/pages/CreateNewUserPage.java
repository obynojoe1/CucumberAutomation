package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CreateNewUserPage {

    public int random;

    // Declare Your locators
    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement SignInLink;

    @FindBy(how = How.ID, using = "email_create")
    public static WebElement CreateNewUserEmailField;

    @FindBy(how = How.ID, using = "SubmitCreate")
    public static WebElement CreateAccountButton;

    @FindBy(how = How.ID, using = "id_gender1")
    public static WebElement MaleGender;

    @FindBy(how = How.ID, using = "customer_firstname")
    public static WebElement UserFirstName;

    @FindBy(how = How.ID, using = "customer_lastname")
    public static WebElement UserLastName;

    @FindBy(how = How.ID, using = "passwd")
    public static WebElement UserPassword;

    @FindBy(how = How.ID, using = "days")
    public static WebElement DoBDay;

    @FindBy(how = How.ID, using = "months")
    public static WebElement DoBMonth;

    @FindBy(how = How.ID, using = "years")
    public static WebElement DoBYear;

    @FindBy(how = How.ID, using = "optin")
    public static WebElement Option;

    @FindBy(how = How.ID, using = "address1")
    public static WebElement Address;

    @FindBy(how = How.ID, using = "city")
    public static WebElement city;

    @FindBy(how = How.ID, using = "id_state")
    public static WebElement States;

    @FindBy(how = How.ID, using = "postcode")
    public static WebElement Postcode;

    @FindBy(how = How.ID, using = "phone_mobile")
    public static WebElement phone_mobile;

    @FindBy(how = How.ID, using = "alias")
    public static WebElement alias;

    @FindBy(how = How.XPATH, using = "//span[text() = 'Register']")
    public static WebElement Register_Button;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    public static WebElement LoggedInUserMessage;


    // Update User Address




    //DECLARE METHOD

    public void ClickHomepageSignIn () {
        SignInLink.click();
    }

    public void EnterNewUserEmail (){
        random = 100 + (int) (Math.random()*(1000-1)+1);
        CreateNewUserEmailField.sendKeys("obynojoe" + random + "@gmail.com");
    }

    public void ClickCreateAccountButton() {

        CreateAccountButton.click();
    }

    public void ClickMaleGender() {
        MaleGender.click();
    }

    public void EnterFirstname () {
        UserFirstName.sendKeys("Obinna");
    }

    public void EnterLastName () {
        UserLastName.sendKeys("Joseph");
    }

    public void EnterPassWord  () {
        UserPassword.sendKeys("binazuka");
    }

    public void SelectDay () {
        Select Day = new Select(DoBDay);
        Day.selectByIndex(24);
    }
    public void SelectMonth () {
        Select Month = new Select(DoBMonth);
        Month.selectByIndex(3);
    }

    public void SelectYear () {
        Select Year = new Select(DoBYear);
        Year.selectByValue("1987");
    }

    public void ClickOption () {
        Option.click();
    }

    public void EnterUserAddress  () {
        Address.sendKeys("testers street number 2");
    }

    public void EnterUserCity () {
        city.sendKeys("Texas");
    }

    public void SelectState () {
        Select State = new Select(States);
        State.selectByIndex(6);
  }

    public void EnterPostCode ()
    {
        Postcode.sendKeys("00000");
    }

    public void EnterPhoneMobile () {

        phone_mobile.sendKeys("01056677432");
    }

    public void EnterAlias () {
        alias.sendKeys("00000");
    }

    public void ClickRegisterButton () {
        Register_Button.click();
    }
    public void AssertUserLoggedIn () {
        String ExpectedLogInUser = "Obinna Joseph";
        String ActualLogInUser = LoggedInUserMessage.getText();
        Assert.assertEquals(ExpectedLogInUser, ActualLogInUser);
        System.out.println(ActualLogInUser);

    }
}


