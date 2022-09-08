
package testFuctionalities;

import core.CommonBaseActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.Browser.driver;

public class CreateNewSecretDiscussion extends CommonBaseActions {
    private static final By DISCUSSIONS_BUTTON = By.xpath("/html[1]/body[1]/app[1]/div[3]/top-menu[1]/div[1]/nav[1]/ul[1]/li[3]/span[1]/a[1]");
    private static final By CREATE_NEW_DISCUSSION_BUTTON = By.cssSelector("body > app:nth-child(2) > div:nth-child(4) > top-menu:nth-child(2) > div:nth-child(1) > nav:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > ul:nth-child(3) > li:nth-child(6) > a:nth-child(1) > span:nth-child(1)");
    private static final By CREATE_TITLE_NAME_FIELD = By.xpath("//textarea");
    private static final By DISCUSSION_SETTINGS_PLUS_BUTTON = By.id("discussion_settings");
    private static final By SECRET_DISCUSSION_RADIO_BUTTON = By.xpath("//div[@class='publication-type-wrapper mb-6']//div[3]//label[1]//span[1]");
    private static final By PUBLISH_BUTTON = By.id("publish_button");
    private final static By ACCEPT_COOKIES_BUTTON = By.id("accept_cookie");
    private final static By TO_PUBLISH2 = By.id("to_publish2");

    
    
    public static void creationOfASecretDiscussion() throws InterruptedException {

        Thread.sleep(3000);
        click(DISCUSSIONS_BUTTON);
        click(CREATE_NEW_DISCUSSION_BUTTON);
        click(CREATE_TITLE_NAME_FIELD);
        type(CREATE_TITLE_NAME_FIELD, "THIS IS AN AUTOMATED SECRET TEST DISCUSSION");

        List<WebElement> editors = driver.findElements(By.cssSelector("iframe[id^='tiny-react_'][id$='_ifr']"));

        driver.switchTo().frame(editors.get(0));
        WebElement PUBLIC_DESCRIPTION_FIELD = driver.findElement(By.id("tinymce"));
        PUBLIC_DESCRIPTION_FIELD.sendKeys("PUBLIC DESCRIPTION TEXT");


        driver.switchTo().defaultContent();

        driver.switchTo().frame(editors.get(1));
        WebElement PARTICIPANT_DESCRIPTION_FIELD = driver.findElement(By.id("tinymce"));
        PARTICIPANT_DESCRIPTION_FIELD.sendKeys("PARTICIPANT DESCRIPTION TEXT");


        driver.switchTo().defaultContent();

        driver.getWindowHandle();
        click(ACCEPT_COOKIES_BUTTON);

        driver.switchTo().defaultContent();
        Thread.sleep(6000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("var evt = document.createEvent('MouseEvents');" + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" + "arguments[0].dispatchEvent(evt);", driver.findElement(By.id("publish_button")));



    }


}


