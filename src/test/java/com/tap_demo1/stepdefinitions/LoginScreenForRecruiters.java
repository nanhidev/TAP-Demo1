package com.tap_demo1.stepdefinitions;
import com.tap_demo1.utils.ElementUtils;
import org.junit.Assert;
import com.tap_demo1.driverfactory.DriverFactory;
import com.tap_demo1.pages.LoginScreenForRecruitersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginScreenForRecruiters extends DriverFactory {
LoginScreenForRecruitersPage loginScreenForRecruitersPage = new LoginScreenForRecruitersPage(driver);
@Given("the user is on the Welcome Page")
public void the_user_is_on_the_welcome_page() {
driver = DriverFactory.getDriver();
loginScreenForRecruitersPage.navigateToWelcomePage();
}
@When("the user opens the application")
public void the_user_opens_the_application() {
loginScreenForRecruitersPage.openApplication();
}
@Then("the application opens successfully")
public void the_application_opens_successfully() {
"Application did not open successfully", loginScreenForRecruitersPage.isApplicationOpened();
}
@And("the user verifies the presence of the 'Get Started' button")
public void the_user_verifies_the_presence_of_get_started_button() {
"Get Started button is not present", loginScreenForRecruitersPage.isGetStartedButtonPresent();
}
@Then("the 'Get Started' button is visible")
public void the_get_started_button_is_visible() {
"Get Started button is not visible", loginScreenForRecruitersPage.isGetStartedButtonVisible();
}
@When("the user clicks on the 'Get Started' button")
public void the_user_clicks_on_get_started_button() {
loginScreenForRecruitersPage.clickGetStartedButton();
}
@Then("the user is navigated to the Organization signup screen")
public void the_user_is_navigated_to_organization_signup_screen() {
"User is not on Organization signup screen", loginScreenForRecruitersPage.isOnOrganizationSignupScreen();
}
@When("the user clicks on the 'Continue as Organization' button")
public void the_user_clicks_on_continue_as_organization_button() {
loginScreenForRecruitersPage.clickContinueAsOrganizationButton();
}
@Then("the user is navigated to the Login page")
public void the_user_is_navigated_to_login_page() {
"User is not on Login page", loginScreenForRecruitersPage.isOnLoginPage();
}
@Given("the user enters {string} in the Email field")
public void the_user_enters_email_in_email_field(String email) {
loginScreenForRecruitersPage.enterEmail(email);
}
@Given("the user enters {string} in the Password field")
public void the_user_enters_password_in_password_field(String password) {
loginScreenForRecruitersPage.enterPassword(password);
}
@Then("the Login button is enabled")
public void the_login_button_is_enabled() {
"Login button is not enabled", loginScreenForRecruitersPage.isLoginButtonEnabled();
}
@When("the user clicks on the Login button")
public void the_user_clicks_on_login_button() {
loginScreenForRecruitersPage.clickLoginButton();
}
@Then("the user should be redirected to the dashboard")
public void the_user_should_be_redirected_to_dashboard() {
"User is not redirected to the dashboard", loginScreenForRecruitersPage.isDashboardDisplayed();
}
@And("the dashboard is displayed without errors")
public void the_dashboard_is_displayed_without_errors() {
"Dashboard has errors", loginScreenForRecruitersPage.isDashboardErrorFree();
}
@When("the user clicks on the 'Show/Hide Password' option")
public void the_user_clicks_on_show_hide_password_option() {
loginScreenForRecruitersPage.togglePasswordVisibility();
}
@Then("the password should be visible")
public void the_password_should_be_visible() {
"Password is not visible", loginScreenForRecruitersPage.isPasswordVisible();
}
@Then("the password should be hidden")
public void the_password_should_be_hidden() {
"Password is still visible", loginScreenForRecruitersPage.isPasswordVisible();
}
@Given("the user opens the application in {string}")
public void the_user_opens_application_in_browser(String browser) {
loginScreenForRecruitersPage.openApplicationInBrowser(browser);
}
@When("the user enters {string} and {string} and logs in")
public void the_user_enters_username_and_password_and_logs_in(String username, String password) {
loginScreenForRecruitersPage.enterEmail(username);
loginScreenForRecruitersPage.enterPassword(password);
loginScreenForRecruitersPage.clickLoginButton();
}
@Then("the user logs in successfully in {string}")
public void the_user_logs_in_successfully_in_browser(String browser) {
"User did not log in successfully in " + browser, loginScreenForRecruitersPage.isDashboardDisplayed();
}
@Given("the user is on the Login page")
public void the_user_is_on_login_page() {
loginScreenForRecruitersPage.navigateToLoginPage();
}
@Then("the user logs in successfully with the new password")
public void the_user_logs_in_successfully_with_new_password() {
"User did not log in successfully with the new password", loginScreenForRecruitersPage.isDashboardDisplayed();
}

@Given("the login button should be enabled")
public void the_login_button_should_be_enabled() {
loginScreen.isLoginButtonEnabled();
}
@When("the user enters {string}")
public void the_user_enters(String username) {
loginScreen.enterUsername(username);
}
@When("i enter a valid password {string} in the password field")
public void i_enter_a_valid_password_in_the_password_field(String password) {
loginScreen.enterPassword(password);
}
@When("i clickElement on the login button")
public void i_click_on_the_login_button() {
loginScreen.clickLoginButton();
}
@When("the user clicks on the 'show/hide password' option again")
public void the_user_clicks_on_show_hide_password_option_again() {
loginScreen.toggleShowHidePassword();
}
@Then("the user should be directed to the dashboard")
public void the_user_should_be_directed_to_the_dashboard() {
loginScreen.isDashboardDisplayed();
}
@When("the user logs out")
public void the_user_logs_out() {
loginScreen.logout();
}
@When("the user logs in successfully in {string}")
public void the_user_logs_in_successfully_in_browser(String browser) {
switch (browser.toLowerCase()) {
case "firefox":
driver = DriverFactory.getFirefoxDriver();
break;
case "chrome":
driver = DriverFactory.getChromeDriver();
break;
case "safari":
driver = DriverFactory.getSafariDriver();
break;
default:
throw new IllegalArgumentException("Browser not supported: " + browser);
}
loginScreen.login();
}
}