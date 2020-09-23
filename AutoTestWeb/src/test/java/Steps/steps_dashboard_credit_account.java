package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class steps_dashboard_credit_account {

    WebDriver driver;
    SharedDriver sharedDriver;

    public steps_dashboard_credit_account(SharedDriver sharedDriver) {
        this.sharedDriver = sharedDriver;
        driver = sharedDriver.getDriver();

    }


    @Then("^i can click on a Credit account$")
    public void iCanClickOnACreditAccount() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[3]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-product-summary-list-widget-extended/bb-product-summary-list-widget/div[4]/div[2]/div/button")).click();
    }


    @And("^i am redirected to the Credit transactions page$")
    public void iAmRedirectedToTheCreditTransactionsPage() {
        String account = "GOLD";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        String s = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[1]/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-account-selector-extended-widget/bb-product-summary-account-selector-widget/bb-account-selector-ui/ng-select/div/div/div[2]/bb-product-item-basic-account-ui/div/div/div[2]/div/div[1]/bb-ellipsis-ui/div")).getText();
        System.out.println(s);
        Assert.assertTrue(s.contains(account));
    }

    @Then("^Credit card details are loaded$")
    public void credit_card_details_are_loaded() throws InterruptedException {
        String name = "7602";
        Thread.sleep(3000);
        WebElement s = driver.findElement(By.xpath("//*[@id=\"bb-main-content\"]/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-deck-container/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-column-container/div/bb-column[1]/bb-chrome/bb-panel-container/bb-area/bb-chrome[2]/bb-panel-container/bb-area/bb-chrome/bb-tab-container/div[2]/bb-route/bb-chrome/bb-panel-container/bb-area/bb-chrome/bb-panel-container/bb-area/bb-chrome/sba-sba-account-details-widget-extended/bb-product-summary-details-widget/bb-product-summary-details/div/div/div/h3"));
        String details = s.getText();
        Assert.assertTrue(details.contains(name));

    }

}

