package Steps;

import Actions.LanguageSwitcher;
import Actions.Login;
import Actions.Logout;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class steps_language_switcher {


    Login login;
    Logout logout;
    WebDriver driver;
    LanguageSwitcher languageSwitcher;
    SharedDriver sharedDriver;

    public steps_language_switcher(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();
        languageSwitcher = new LanguageSwitcher(driver);
        login = new Login(driver);
        logout = new Logout(driver);

    }

    @Then("^want to change language$")
    public void want_to_change_language() throws Throwable {
       // login.openBrowser();
        // languageSwitcher = new LanguageSwitcher(driver);
        languageSwitcher.ChangeLang();

    }

    @And("^change language successfully$")
    public void changeLanguageSuccessfully() throws InterruptedException {
        boolean x = languageSwitcher.isEN();
        if (x == false) {
            logout.findDropdownLogout();
        }
    }
}
