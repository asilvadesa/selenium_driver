package fogotPassword;

import base.BaseTests;
import org.junit.jupiter.api.Test;

public class ForgotPasswordTests  extends BaseTests {

    @Test
    public void testRetrievePasswordWithSucess(){
        var forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.retrievePassword("asilvadesa@example.com");
    }
}
