package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public final static String LOGIN_FIELD = "//input[@aria-describedby='login-form-errors']";
    public final static String PASSWORD_FIELD = "//input[@type='password']";
    public final static String LOGIN_BUTTON = "//button[@type='submit']";
    public final static String WELCOME_MESSAGE = "//*[text()='Welcome Message']";

    public void navigateToLoginPage(String url) {
        driver.get(url);
    }

    public boolean isLoginFieldDisplayed() {
        return isElementDisplayed(LOGIN_FIELD);
    }

    public boolean isPasswordFieldDisplayed() {
        return isElementDisplayed(PASSWORD_FIELD);
    }

    public boolean isLoginButtonDisplayed() {
        return isElementDisplayed(LOGIN_BUTTON);
    }

    public boolean isWelcomeMessageDisplayed() {
        return isElementDisplayed(WELCOME_MESSAGE);
    }

    public void typeCredentials(String loginText, String passwordText) {
        WebElement loginField = driver.findElement(By.xpath(LOGIN_FIELD));
        loginField.sendKeys(loginText);
        WebElement passwordField = driver.findElement(By.xpath(PASSWORD_FIELD));
        passwordField.sendKeys(passwordText);
    }

    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.xpath(LOGIN_BUTTON));
        loginButton.click();
    }

    public String redirectToHomepage() {
        String actualUrl = driver.getCurrentUrl();
        return actualUrl;
    }
}
