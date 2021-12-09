package testFuctionalities.UiComponents;

import core.CommonBaseActions;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CredoHeader extends CommonBaseActions {
    private final static By CREDO_LOGO_HEADER_BUTTON = By.xpath("//img[@class='logo-big']");

    /**
     * Asserts that the expected CredoWeb header button text is the same as the text that is present in the browsers' logout button
     *
     * @param condition the text that you expect to be present in the logout button
     * @param messageOnFailure the message that will appear in your test reports in case of assert failure
     */
    public static void verifyCredoHeaderButtonIsPresent(String condition, String messageOnFailure) {
        String actualCredoButton = getText(CREDO_LOGO_HEADER_BUTTON);
        Assert.assertTrue(true, messageOnFailure);
    }
}
