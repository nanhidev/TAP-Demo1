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
        return driver.getTitle().contains("Application Title");
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
        return driver.getTitle().contains("Organization Signup Title");
    }

    public void clickContinueAsOrganizationButton() {
        try {
            elementUtils.clickElement(continueAsOrganizationButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isOnLoginPage() {
        return driver.getTitle().contains("Login Title");
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
        return true; // Implement specific error checks as needed
    }

    public void togglePasswordVisibility() {
        try {
            elementUtils.clickElement(showHidePasswordOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isPasswordVisible() {
        return passwordField.getAttribute("type").equals("text");
    }

    public void openApplicationInBrowser(String browser) {
        // Code to open application in specified browser
    }

    public void navigateToLoginPage() {
        try {
            driver.get("http://localhost/login");
            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "http://localhost/login";
            Assert.assertEquals(actualUrl, expectedUrl, "URL does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}