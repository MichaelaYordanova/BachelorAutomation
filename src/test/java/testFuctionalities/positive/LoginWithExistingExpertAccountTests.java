package testFuctionalities.positive;

import core.BaseTest;
import org.testng.annotations.Test;
import testFuctionalities.LoginWithExistingExpertAccount;
import testFuctionalities.UiComponents.CredoHeader;

public class LoginWithExistingExpertAccountTests extends BaseTest {

        @Test
        public void successfulLogin() {
            LoginWithExistingExpertAccount.openCredoLive();
            LoginWithExistingExpertAccount.login("mmm123@amail.club", "123123");
            LoginWithExistingExpertAccount.verifyProfilePictureIsVisible("true", "Profile photo is not visible, might not be logged in");

        }

    }

