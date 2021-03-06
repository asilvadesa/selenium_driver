package keys;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import page.KeyPressesPage;

import static org.junit.jupiter.api.Assertions.*;

public class KeysTests extends BaseTests {

    @Test
    public void testBackSpace(){
        var keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals("You entered: BACK_SPACE", keyPressesPage.getResult(), "Keys incorrect");
    }

    @Test
    public void testPi(){
        var keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterPi();
        assertEquals("You entered: 4", keyPressesPage.getResult());
    }
}
