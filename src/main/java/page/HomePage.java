package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthenticationLink;

    @FindBy(linkText = "Dropdown")
    private WebElement dropdownLink;

    @FindBy(linkText = "Forgot Password")
    private WebElement forgotPassword;

    @FindBy(linkText = "Hovers")
    private WebElement hovers;

    @FindBy(linkText = "Key Presses")
    private WebElement keyPresses;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public LoginPage clickFormAuthentication(){
        formAuthenticationLink.click();
        return new LoginPage(driver);
    }

    public DropDrownPage clickDropdown(){
        dropdownLink.click();
        return new DropDrownPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword(){
        forgotPassword.click();
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickHovers(){
        hovers.click();
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        keyPresses.click();
        return new KeyPressesPage(driver);
    }
}
