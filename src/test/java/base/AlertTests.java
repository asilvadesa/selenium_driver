package base;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.AlertPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlertTests extends BaseTests {

    private AlertPage alertsPage;

    @BeforeEach
    public void setup(){
        alertsPage = homePage.clickJavaScriptAlert();
    }

    @Test
    public void testAcceptAlert(){
        alertsPage.triggerAlert();
        alertsPage.alertClickToAccept();
        assertEquals("You successfully clicked an alert", alertsPage.getResult(),
                "Result text incorrect");
    }

    @Test
    public void testDismissAlert(){
        alertsPage.triggerConfirm();
        alertsPage.alertClickToDismiss();
        assertEquals("You clicked: Cancel", alertsPage.getResult(),
                "Result text incorrect");
    }

    @Test
    public void testSendTextToPrompt(){
        alertsPage.triggerPrompt();
        alertsPage.alertSetTextToPrompt("TAU rocks!");
        assertEquals("You entered: TAU rocks!", alertsPage.getResult(),
                "Result text incorrect");
    }
}
