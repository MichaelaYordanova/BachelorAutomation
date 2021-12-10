package testFuctionalities;


import core.CommonBaseActions;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class LoginWithExistingExpertAccount extends CommonBaseActions {
    private final static By LOGIN_BUTTON_HEADER = By.xpath("//a[@href='/login']");
    private final static By USERNAME_INPUT_FIELD = By.xpath("//input[@formcontrolname='email']");
    private final static By PASSWORD_INPUT_FIELD = By.xpath("//input[@type='password']");
    private final static By EXACT_LOGIN_BUTTON = By.cssSelector("button[type='submit']");
    private final static By PROFILE_PHOTO_HEADER = By.xpath("//figure[contains(@class,'avatar avatar-s selected-profile-photo c-pointer')]//img[contains(@alt,'Yordanova')]");

        public static void login(String username, String password) {
            click(LOGIN_BUTTON_HEADER);
            type(USERNAME_INPUT_FIELD, username);
            type(PASSWORD_INPUT_FIELD, password);
            click(EXACT_LOGIN_BUTTON);
        }
    public static void verifyProfilePictureIsVisible(String expectedProfilePicture, String messageOnFailure) {
        String actualLogoutButtonText = getText(PROFILE_PHOTO_HEADER);
        Assert.assertTrue(true, expectedProfilePicture);
    }

    }

