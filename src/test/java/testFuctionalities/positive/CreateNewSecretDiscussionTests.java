package testFuctionalities.positive;

import core.BaseTest;
import org.testng.annotations.Test;
import testFuctionalities.CreateNewSecretDiscussion;
import testFuctionalities.LoginWithExistingExpertAccount;

public class CreateNewSecretDiscussionTests extends BaseTest {

    @Test
    public void creationOfASecretDiscussion() throws InterruptedException {
        LoginWithExistingExpertAccount.openCredoLive();
        LoginWithExistingExpertAccount.login("mmm123@amail.club", "123123");
        LoginWithExistingExpertAccount.verifyProfilePictureIsVisible("true", "Profile photo is not visible, might not be logged in");
        CreateNewSecretDiscussion.creationOfASecretDiscussion();
    }
}
