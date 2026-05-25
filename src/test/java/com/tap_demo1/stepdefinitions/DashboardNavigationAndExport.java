package com.tap_demo1.stepdefinitions;
import com.tap_demo1.utils.ElementUtils;
import org.junit.Assert;
import com.tap_demo1.driverfactory.DriverFactory;
import com.tap_demo1.pages.DashboardNavigationAndExportPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class DashboardNavigationAndExport extends DriverFactory {
DashboardNavigationAndExportPage dashboardPage = new DashboardNavigationAndExportPage(driver);
@Given("the user is on the Login Page")
public void the_user_is_on_the_login_page() {
driver = DriverFactory.getDriver();
dashboardPage.navigateToLoginPage();
}
@When("I enter {string}")
public void i_enter_username(String username) {
dashboardPage.enterUsername(username);
}
// DUPLICATE: @When("I enter {string}")
// DUPLICATE: public void i_enter_password(String password) {
// DUPLICATE: dashboardPage.enterPassword(password);
// DUPLICATE: }
@When("I click the {string} button")
public void i_click_the_button(String buttonName) {
dashboardPage.clickLoginButton(buttonName);
}
@When("I wait for the system to process the login request")
public void i_wait_for_the_system_to_process_the_login_request() {
dashboardPage.waitForLoginProcessing();
}
@Then("the user should be redirected to the Dashboard page")
public void the_user_should_be_redirected_to_the_dashboard_page() {
"Dashboard page is not displayed", dashboardPage.isDashboardPageDisplayed();
}
@Then("no error messages are displayed")
public void no_error_messages_are_displayed() {
"Error messages are displayed", dashboardPage.isErrorMessageDisplayed();
}
@Then("the Dashboard page should load completely with all elements visible")
public void the_dashboard_page_should_load_completely_with_all_elements_visible() {
"Not all dashboard elements are visible", dashboardPage.areAllDashboardElementsVisible();
}
@When("the user observes the sidebar menu on the Dashboard")
public void the_user_observes_the_sidebar_menu_on_the_dashboard() {
dashboardPage.observeSidebarMenu();
}
@When("the user identifies all available menu options")
public void the_user_identifies_all_available_menu_options() {
dashboardPage.identifyMenuOptions();
}
@When("the user checks for the presence of options like {string}, {string}, {string}")
public void the_user_checks_for_the_presence_of_options(String menuOption1, String menuOption2, String menuOption3) {
"Menu option " + menuOption1 + " is not present", dashboardPage.isMenuOptionPresent(menuOption1);
"Menu option " + menuOption2 + " is not present", dashboardPage.isMenuOptionPresent(menuOption2);
"Menu option " + menuOption3 + " is not present", dashboardPage.isMenuOptionPresent(menuOption3);
}
@When("the user verifies that each option is clickable")
public void the_user_verifies_that_each_option_is_clickable() {
"Not all menu options are clickable", dashboardPage.areMenuOptionsClickable();
}
@When("the user hovers over each option to check for tooltips")
public void the_user_hovers_over_each_option_to_check_for_tooltips() {
dashboardPage.checkTooltipsOnHover();
}
@When("the user ensures that the sidebar is responsive and adjusts to screen size")
public void the_user_ensures_that_the_sidebar_is_responsive_and_adjusts_to_screen_size() {
"Sidebar is not responsive", dashboardPage.isSidebarResponsive();
}
@Then("all expected sidebar options are displayed")
public void all_expected_sidebar_options_are_displayed() {
"Expected sidebar options are not displayed", dashboardPage.areExpectedSidebarOptionsDisplayed();
}
@Then("each option is clickable and leads to the corresponding module")
public void each_option_is_clickable_and_leads_to_the_corresponding_module() {
"Sidebar options are not navigable", dashboardPage.areSidebarOptionsNavigable();
}
@Then("tooltips appear on hover (if applicable)")
public void tooltips_appear_on_hover_if_applicable() {
"Tooltips are not visible on hover", dashboardPage.areTooltipsVisible();
}
@When("the user clicks on the {string} sidebar option")
public void the_user_clicks_on_the_sidebar_option(String sidebarOption) {
dashboardPage.clickSidebarOption(sidebarOption);
}
@When("the user waits for the page to load")
public void the_user_waits_for_the_page_to_load() {
dashboardPage.waitForPageToLoad();
}
@Then("the {string} module information should be displayed")
public void the_module_information_should_be_displayed(String moduleName) {
moduleName + " module information is not displayed", dashboardPage.isModuleInformationDisplayed(moduleName);
}
// DUPLICATE: @When("the user clicks on the {string} sidebar option")
// DUPLICATE: public void the_user_clicks_on_the_sidebar_option_settings(String action) {
// DUPLICATE: dashboardPage.clickSidebarOption(action);
// DUPLICATE: }
@Then("the {string} module loads without errors")
public void the_module_loads_without_errors(String moduleName) {
moduleName + " module did not load without errors", dashboardPage.isModuleLoadedWithoutErrors(moduleName);
}
@Then("the user should be redirected back to the Dashboard page")
public void the_user_should_be_redirected_back_to_the_dashboard_page() {
"User is not redirected back to the Dashboard page", dashboardPage.isDashboardPageDisplayed();
}
@Then("the Dashboard page content should be displayed correctly")
public void the_dashboard_page_content_should_be_displayed_correctly() {
"Dashboard page content is not displayed correctly", dashboardPage.isDashboardContentDisplayedCorrectly();
}
@Then("the sidebar should remain functional and visible")
public void the_sidebar_should_remain_functional_and_visible() {
"Sidebar is not functional", dashboardPage.isSidebarFunctional();
}
@When("I observe the Dashboard page layout")
public void i_observe_the_dashboard_page_layout() {
dashboardPage.observeDashboardLayout();
}
@When("I look for the Export button")
public void i_look_for_the_export_button() {
"Export button is not visible", dashboardPage.isExportButtonVisible();
}
@When("I check the button's label and design")
public void i_check_the_button_label_and_design() {
Assert.assertEquals("Export", dashboardPage.getExportButtonLabel());
}
@When("I verify the button's position on the page")
public void i_verify_the_button_position_on_the_page() {
"Export button position is incorrect", dashboardPage.isExportButtonPositionCorrect();
}
@When("I ensure the button is enabled and clickable")
public void i_ensure_the_button_is_enabled_and_clickable() {
"Export button is not enabled", dashboardPage.isExportButtonEnabled();
}
@When("I check for any tooltips or help text associated with the button")
public void i_check_for_any_tooltips_or_help_text_associated_with_the_button() {
"Export button tooltip is not visible", dashboardPage.isExportButtonTooltipVisible();
}
@Then("the Export button is present on the Dashboard page")
public void the_export_button_is_present_on_the_dashboard_page() {
"Export button is not present on the Dashboard page", dashboardPage.isExportButtonVisible();
}
@Then("the button is clearly labeled {string}")
public void the_button_is_clearly_labeled(String buttonLabel) {
Assert.assertEquals("Export button label is incorrect", buttonLabel, dashboardPage.getExportButtonLabel());
}
@Then("the button is visually distinct and clickable")
public void the_button_is_visually_distinct_and_clickable() {
"Export button is not visually distinct", dashboardPage.isExportButtonDistinct();
}
@Then("tooltips or help text appear on hover (if applicable)")
public void tooltips_or_help_text_appear_on_hover_if_applicable() {
"Export button tooltip is not visible on hover", dashboardPage.isExportButtonTooltipVisible();
}
@When("the user clicks the {string} button on the Dashboard")
public void the_user_clicks_the_button_on_the_dashboard(String buttonName) {
dashboardPage.clickExportButton(buttonName);
}
@When("the user waits for the system to process the export request")
public void the_user_waits_for_the_system_to_process_the_export_request() {
dashboardPage.waitForExportProcessing();
}
@Then("a download prompt should appear for the user")
public void a_download_prompt_should_appear_for_the_user() {
"Download prompt is not visible", dashboardPage.isDownloadPromptVisible();
}
@Then("the user selects the download location (if prompted)")
public void the_user_selects_the_download_location_if_prompted() {
dashboardPage.selectDownloadLocation();
}
@Then("the user opens the downloaded file")
public void the_user_opens_the_downloaded_file() {
dashboardPage.openDownloadedFile();
}
@Then("the downloaded file should be in the correct format {string}")
public void the_downloaded_file_should_be_in_the_correct_format(String fileFormat) {
"Downloaded file format is incorrect", dashboardPage.isFileFormatCorrect(fileFormat);
}
@Given("the user has downloaded the report from the Dashboard")
public void the_user_has_downloaded_the_report_from_the_dashboard() {
dashboardPage.downloadReport();
}
@When("the user opens the downloaded report file")
public void the_user_opens_the_downloaded_report_file() {
dashboardPage.openDownloadedReport();
}
@Then("the report file opens without errors")
public void the_report_file_opens_without_errors() {
"Report file did not open without errors", dashboardPage.isReportFileOpenedWithoutErrors();
}
@Then("the report contains valid and relevant data")
public void the_report_contains_valid_and_relevant_data() {
"Report data is not valid", dashboardPage.isReportDataValid();
}
@Then("all expected headers are present in the report")
public void all_expected_headers_are_present_in_the_report() {
"Expected headers are not present in the report", dashboardPage.areExpectedHeadersPresent();
}
@Then("the data matches the information displayed on the Dashboard")
public void the_data_matches_the_information_displayed_on_the_dashboard() {
"Report data does not match Dashboard information", dashboardPage.isReportDataMatchingDashboard();
}
@Then("the file can be opened in Excel without issues")
public void the_file_can_be_opened_in_excel_without_issues() {
"File cannot be opened in Excel", dashboardPage.canOpenFileInExcel();
}
@When("the user resizes the browser window to a smaller width")
public void the_user_resizes_the_browser_window_to_a_smaller_width() {
dashboardPage.resizeBrowserToSmallerWidth();
}
@Then("the sidebar menu adjusts appropriately to smaller screen sizes")
public void the_sidebar_menu_adjusts_appropriately_to_smaller_screen_sizes() {
"Sidebar menu did not adjust to smaller screen size", dashboardPage.isSidebarMenuAdjusted();
}
@When("the user checks the sidebar menu layout")
public void the_user_checks_the_sidebar_menu_layout() {
dashboardPage.checkSidebarMenuLayout();
}
@Then("all sidebar options remain functional when clicked")
public void all_sidebar_options_remain_functional_when_clicked() {
"Sidebar options are not functional", dashboardPage.areSidebarOptionsFunctional();
}
@When("the user resizes the browser back to a larger width")
public void the_user_resizes_the_browser_back_to_a_larger_width() {
dashboardPage.resizeBrowserToLargerWidth();
}
@Then("the sidebar returns to its original layout on larger screens")
public void the_sidebar_returns_to_its_original_layout_on_larger_screens() {
"Sidebar did not return to original layout", dashboardPage.isSidebarLayoutOriginal();
}
@When("the user observes any success messages displayed")
public void the_user_observes_any_success_messages_displayed() {
"Success message is not displayed", dashboardPage.isSuccessMessageDisplayed();
}
@When("the user checks for visual indicators during processing")
public void the_user_checks_for_visual_indicators_during_processing() {
"Visual indicators are not displayed during processing", dashboardPage.isVisualIndicatorDisplayed();
}
@Then("a success message is displayed after the export is completed")
public void a_success_message_is_displayed_after_the_export_is_completed() {
"Success message is not displayed after export", dashboardPage.isSuccessMessageDisplayedAfterExport();
}
@Then("visual indicators show that the export is in progress")
public void visual_indicators_show_that_the_export_is_in_progress() {
"Visual indicators do not show export in progress", dashboardPage.isExportInProgressIndicatorVisible();
}
@Then("the download prompt appears after the success message")
public void the_download_prompt_appears_after_the_success_message() {
"Download prompt did not appear after success message", dashboardPage.isDownloadPromptVisibleAfterSuccess();
}

@When("the user clicks the export button on the dashboard")
public void the_user_clicks_the_export_button_on_the_dashboard() {
dashboardPage.clickExportButton();
}
@When("the user clicks on the dashboard sidebar option")
public void the_user_clicks_on_the_dashboard_sidebar_option() {
dashboardPage.clickDashboardSidebarOption();
}
// DUPLICATE: @Then("the downloaded file should be in the correct format {string}")
// DUPLICATE: public void the_downloaded_file_should_be_in_the_correct_format(String expectedFormat) {
// DUPLICATE: Assert.assertTrue("The downloaded file is not in the expected format.",
// DUPLICATE: dashboardPage.isDownloadedFileInCorrectFormat(expectedFormat));
// DUPLICATE: }
@Given("the settings module loads without errors")
public void the_settings_module_loads_without_errors() {
dashboardPage.loadSettingsModule();
Assert.assertTrue("Settings module did not load successfully.",
dashboardPage.isSettingsModuleLoadedSuccessfully());
}
@When("the user clicks on the settings sidebar option")
public void the_user_clicks_on_the_settings_sidebar_option() {
dashboardPage.clickSettingsSidebarOption();
}
@When("I clickElement the login button")
public void i_click_the_login_button() {
dashboardPage.clickLoginButton();
}
}