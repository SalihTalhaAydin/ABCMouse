package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ABCMousePage {

    public ABCMousePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "signup-button")
    private WebElement signUpButton;

    @FindBy(id = "email")
    private WebElement emailInputBox;

    @FindBy(id = "submit-button")
    private WebElement submitButton;

    @FindBy(id = "become-member")
    private WebElement becomeMemberHeader;

    public void signUp(){
        signUpButton.click();
    }

    public void giveEmailAndSubmit(String email){
        emailInputBox.sendKeys(email);
        submitButton.click();
    }

    public void validateHeaderVisible(String expectedHeaderText){
        Assert.assertEquals(expectedHeaderText, becomeMemberHeader.getText());
    }
}
