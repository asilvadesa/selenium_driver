package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage {

    private WebDriver driver;

    @FindBy(xpath = ".//button[text()='Click for JS Alert']")
    private WebElement triggerAlertButton;

    @FindBy(xpath = ".//button[text()='Click for JS Confirm']")
    private WebElement triggerConfirmButton;

    @FindBy(xpath = ".//button[text()='Click for JS Prompt']")
    private WebElement triggerPromptButton;

    @FindBy(id = "result")
    private WebElement result;

    public AlertPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void triggerAlert(){
        triggerAlertButton.click();
    }

    public void triggerConfirm(){
        triggerConfirmButton.click();
    }

    public void triggerPrompt(){
        triggerPromptButton.click();
    }

    public void alertClickToAccept(){
        driver.switchTo().alert().accept();
    }

    public void alertClickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public void alertSetTextToPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
    }

    public String getResult(){
        return result.getText();
    }
}
