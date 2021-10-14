package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HorizontalSliderPage {

    private WebDriver driver;

    @FindBy(css = "input[type=range]")
    private WebElement horizontalSlider;

    @FindBy(id = "range")
    private WebElement rangeValue;

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setHorizontalSlider(){
        horizontalSlider.sendKeys(Keys.ARROW_RIGHT);
    }

    public String getRangeText(){
        return rangeValue.getText();
    }
}
