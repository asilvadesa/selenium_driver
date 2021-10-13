package hovers;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HoversTests extends BaseTests {

    @Test
    public void testHoversUser1() throws InterruptedException {
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption not displayed");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
        assertEquals("name: user1", caption.getTitle(), "Caption title incorrect");
        assertEquals("View profile", caption.getLinkText(), "Caption link text incorrect");
    }
}
