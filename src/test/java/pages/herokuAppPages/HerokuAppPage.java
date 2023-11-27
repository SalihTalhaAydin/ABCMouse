package pages.herokuAppPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.UICommonUtils;

import java.util.List;

public class HerokuAppPage {

    public HerokuAppPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#content ul li")
    private List<WebElement> allHomePageLinks;

    @FindBy(css = "#content ul")
    private WebElement allHomePageLinksParent;

    public void clickOnHomePageLink(String linkText){
        UICommonUtils.getElementByText(allHomePageLinksParent, linkText).click();
    }
}
