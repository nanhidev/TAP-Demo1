package com.tap_demo1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tap_demo1.utils.ElementUtils;
import org.junit.Assert;

public class LoginScreenForRecruitersPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "getStartedButton")
    private WebElement getStartedButton;

    @FindBy(id = "continueAsOrganizationButton")
    private WebElement continueAsOrganizationButton;

    @FindBy(id = "emailField")
    private WebElement emailField;

    @FindBy(id = "passwordField")
    private WebElement passwordField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "dashboard")
    private WebElement dashboard;

    @FindBy(id = "showHidePassword")
    private WebElement showHidePasswordOption;

    public LoginScreenForRecruitersPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils();
        PageFactory.initElements(driver, this);
    }

    public void navigateToWelcomePage() {
        driver.get("http://localhost/welcome");
    }

    public void openApplication() {
        driver.get("http://localhost/application");
    }

    public boolean isApplicationOpened() {
        return driver.getCurrentUrl().contains("application");
    }

    public boolean isGetStartedButtonPresent() {
        return elementUtils.isElementDisplayed(getStartedButton);
    }

    public boolean isGetStartedButtonVisible() {
        return elementUtils.isElementDisplayed(getStartedButton);
    }

    public void clickGetStartedButton() {
        try {
            elementUtils.clickElement(getStartedButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isOnOrganizationSignupScreen() {
        return driver.getCurrentUrl().contains("organizationSignup");
    }

    public void clickContinueAsOrganizationButton() {
        try {
            elementUtils.clickElement(continueAsOrganizationButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isOnLoginPage() {
        return driver.getCurrentUrl().contains("login");
    }

    public void enterEmail(String email) {
        try {
            elementUtils.clearAndSendKeys(emailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isLoginButtonEnabled() {
        return loginButton.isEnabled();
    }

    public void clickLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isDashboardDisplayed() {
        return elementUtils.isElementDisplayed(dashboard);
    }

    public boolean isDashboardErrorFree() {
        // Implement logic to check for dashboard errors
        return true;
    }

    public void togglePasswordVisibility() {
        try {
            elementUtils.clickElement(showHidePasswordOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isPasswordVisible() {
        // Implement logic to check if password is visible or hidden
        return true;
    }

    public void openApplicationInBrowser(String browser) {
        // Open application in specified browser
        // Code to handle browser opening
    }

    public void logout() {
        // Implement logout logic
    }

    public void login() {
        // Implement login logic
    }

    public void navigateToLoginPage() {
        try {
            driver.get("http://localhost/login");
            String actualTitle = driver.getTitle();
            String expectedTitle = "Login Page";
            Assert.assertEquals(actualTitle, expectedTitle, "Title does not match after navigating to login page!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}