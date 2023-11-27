package stepDefs;

import io.cucumber.java.en.And;
import utils.ConfigReader;

public class HerokuSteps {
    @And("user verifies the {string} text is visible on the heroku login page.")
    public void userVerifiesTheTextIsVisibleOnTheHerokuLoginPage(String loginPageText) {
        Hooks.herokuAppLoginPage.validateHeader(loginPageText);
    }

    @And("enters {string} as user name and {string} as password and logs in.")
    public void entersAsUserNameAndAsPasswordAndLogsIn(String userName, String password) {
        userName = ConfigReader.replaceWithConfig(userName);
        password = ConfigReader.replaceWithConfig(password);
        Hooks.herokuAppLoginPage.login(userName, password);
    }

    @And("clicks on {string} from heroku app home page.")
    public void clicksOnFromHerokuAppHomePage(String linkText) {
        Hooks.herokuAppPage.clickOnHomePageLink(linkText);
    }

    @And("user verifies the {string} text content is visible.")
    public void userVerifiesTheTextContentIsVisible(String textContent) {
        Hooks.herokuAppLoginPage.validateTextContent(textContent);
    }
}
