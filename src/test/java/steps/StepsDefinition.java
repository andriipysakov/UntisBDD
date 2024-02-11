package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.*;
import pages.LoginPage;

public class StepsDefinition {
    private final LoginPage loginPage;

    public StepsDefinition() {
        loginPage = new LoginPage();
    }

    @Given("the user is on the {string} page")
    public void theUserIsOnThePage(String url) {
        loginPage.navigateToLoginPage(url);
        loginPage.isLoginFieldDisplayed();
        loginPage.isPasswordFieldDisplayed();
        loginPage.isLoginButtonDisplayed();
    }

    @When("the user enters their valid username and password")
    public void theUserEntersTheirValidUsernameAndPassword() {
        loginPage.typeCredentials("valid login", "valid password");
    }

    @And("clicks on the login button")
    public void clicksOnTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("the user should be redirected to the {string} page")
    public void theUserShouldBeRedirectedToTheHomepage(String expectedUrl) {
        assertEquals(expectedUrl, loginPage.redirectToHomepage());
    }

    @And("a welcome message should be displayed.")
    public void aWelcomeMessageShouldBeDisplayed() {
        assertTrue(loginPage.isWelcomeMessageDisplayed());
    }
}
