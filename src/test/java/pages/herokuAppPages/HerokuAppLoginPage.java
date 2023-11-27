package pages.herokuAppPages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import stepDefs.Hooks;
import utils.WaitUtils;

public class HerokuAppLoginPage extends HerokuAppPage{

    public HerokuAppLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "h2" )
    private WebElement header;

    @FindBy(tagName = "h4" )
    private WebElement subHeader;

    @FindBy(id = "username" )
    private WebElement userNameInputBox;

    @FindBy(id = "password" )
    private WebElement passwordInputBox;

    @FindBy(css = "[type='submit']" )
    private WebElement loginButton;

    public void validateHeader(String expectedText){
        WaitUtils.waitForElementToHaveText(Hooks.driver, header, expectedText);
        Assert.assertEquals(expectedText, header.getText());
    }

    public void validateTextContent(String expectedTextContent){
        WaitUtils.waitForElementToHaveText(Hooks.driver, subHeader, expectedTextContent);
        Assert.assertEquals(expectedTextContent, subHeader.getText());
    }

    public void login(String userName, String password){
        userNameInputBox.sendKeys(userName);
        passwordInputBox.sendKeys(password);
        loginButton.click();
    }
}
