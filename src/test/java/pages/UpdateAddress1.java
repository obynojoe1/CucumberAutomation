package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class UpdateAddress1 {


    public int random;

    @FindBy(how = How.ID, using = "email")
    public static WebElement EnterUsername;

    @FindBy (how = How.ID, using = "passwd")
    public static WebElement EnterPassword;

    @FindBy(how = How.ID, using = "SubmitLogin")
    public static WebElement ClickSignIn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span")
    public static WebElement AddressLink;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[1]/span")
    public static WebElement UpdateAddress;

    @FindBy(how = How.ID, using = "address1")
    public static WebElement EnterNewAddress;

    @FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
    public static WebElement EnterTheCity;

    @FindBy(how = How.ID, using = "uniform-id_state")
    public static WebElement EnterNewState;

     @FindBy(how = How.ID, using = "postcode")
     public static WebElement EnterNewPostCode;

    @FindBy(how = How.ID, using = "submitAddress")
    public static WebElement SaveAddress;




    public void EnterUserEmail(){
        EnterUsername.sendKeys("obynojoe12@gmail.com");
    }

    public void EnterUserPassword(){
        EnterPassword.sendKeys("testing");
    }

    public void ClickSigninButton() {
        ClickSignIn.click();
    }
    public void ClickAddressLink() {
        AddressLink.click();
    }

    public void ClickUpdateLink(){
        UpdateAddress.click();
    }

    public void EnterAddress(){
        EnterNewAddress.clear();
        EnterNewAddress.sendKeys("No 2 Obama Street");
    }

    public void EnterCity(){
       EnterTheCity.clear();
       EnterTheCity.sendKeys("Indianapolis");
    }
    public void SelectNewState () {
       Select States = new Select(EnterNewState);
       States.selectByIndex(1);
    }

    public void EnterPostcode(){
        EnterNewPostCode.clear();
        EnterNewPostCode.sendKeys("12345");
    }
    public void ClickSaveAddress(){
        SaveAddress.click();
    }


}




