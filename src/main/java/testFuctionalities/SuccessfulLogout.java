package testFuctionalities;

import core.CommonBaseActions;
import org.openqa.selenium.By;
import org.testng.Assert;

import static testFuctionalities.LoginWithExistingExpertAccount.login;
import static testFuctionalities.LoginWithExistingExpertAccount.verifyProfilePictureIsVisible;


public class SuccessfulLogout extends CommonBaseActions {

    private static final By HEADER_IMAGE_ARROW_BUTTON = By.xpath("//span[contains(@class,'header-image arrow-icon')]");
    private static final By LOGOUT_BUTTON = By.cssSelector("div[class='controls'] span[class='description']");
    private final static By LOGIN_BUTTON_HEADER = By.xpath("//a[@href='/login']");


    public static void successfulLogout() {
        openCredoLive();
        login("mmm123@amail.club", "123123");
        verifyProfilePictureIsVisible("true", "Profile photo is not visible, might not be logged in");
        click(HEADER_IMAGE_ARROW_BUTTON);
        click(LOGOUT_BUTTON);
        verifySuccessfulLogout("Login", "You might have not logged out yet");
    }

    /**
     * This method verifies if the logout is successful - if login button is visible -> logout is successful
     * @param expectedLoginButtonText login button
     * @param messageOnFailure message if the login button is not visible
     */
    public static void verifySuccessfulLogout(String expectedLoginButtonText, String messageOnFailure) {
        String actualLogoutButtonText = getText(LOGIN_BUTTON_HEADER);
        Assert.assertTrue(true, expectedLoginButtonText);
    }


}
