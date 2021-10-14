package horizontal;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HorizontalTests extends BaseTests {

    @Test
    public void testHorizontalSlider(){
        var horizontalPage = homePage.clickHorizontalSlider();
        horizontalPage.setHorizontalSlider();
        Assertions.assertEquals("0.5", horizontalPage.getRangeText(), "Range incorrect");
    }
}
