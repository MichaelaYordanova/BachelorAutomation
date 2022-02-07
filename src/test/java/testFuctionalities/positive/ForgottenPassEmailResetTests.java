package testFuctionalities.positive;
import core.BaseTest;
import org.testng.annotations.Test;
import testFuctionalities.ForgottenPassEmailReset;

public class ForgottenPassEmailResetTests extends BaseTest {

    @Test
    public static void resetPassViaEmail() throws InterruptedException {
        ForgottenPassEmailReset.openCredoLive();
        ForgottenPassEmailReset.resetPasswordViaEmail("mish123@mail.bg");
        ForgottenPassEmailReset.verifyEmailHasBeenSent("true", "Maybe email was not sent");
    }
}
