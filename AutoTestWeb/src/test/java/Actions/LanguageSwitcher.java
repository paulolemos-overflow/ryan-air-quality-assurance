package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LanguageSwitcher {
    private static WebDriver driver;

    public LanguageSwitcher(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ChangeLang() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("dropdownMenuButton")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/div/div/a")).click();
    }

    public boolean isEN(){
        if (driver.findElement(By.id("dropdownMenuButton")).getText().equalsIgnoreCase("English (UK)")) {
            System.out.println(driver.findElement(By.id("dropdownMenuButton")).getText());
            return true;
        } else {
            System.out.println(driver.findElement(By.id("dropdownMenuButton")).getText());
            return false;
        }
    }

}
