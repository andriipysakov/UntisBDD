package pages;

import app.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public abstract class BasePage {
    protected WebDriver driver = WebDriverSetup.getWebDriver();

    public boolean isElementDisplayed(String xpath) {
        List<WebElement> webElementList = driver.findElements(By.xpath(xpath));
        return webElementList.size() > 0;
    }
}
