package com.tap_demo1.stepdefinitions;
import com.tap_demo1.utils.ElementUtils;
import org.junit.Assert;
import com.tap_demo1.driverfactory.DriverFactory;
import com.tap_demo1.pages.ManageRolesInUserManagementPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ManageRolesInUserManagement extends DriverFactory {
ManageRolesInUserManagementPage manageRolesPage = new ManageRolesInUserManagementPage(driver);
@Given("the user is in the User Management module")
public void the_user_is_in_the_user_management_module() {
manageRolesPage.navigateToUserManagementModule();
}
@When("the user clicks on the Roles tab")
public void the_user_clicks_on_the_roles_tab() {
manageRolesPage.clicksOnRolesTab();
}
@When("the user observes the displayed roles list")
public void the_user_observes_the_displayed_roles_list() {
manageRolesPage.observeDisplayedRolesList();
}
@Then("the roles list should be displayed without errors")
public void the_roles_list_should_be_displayed_without_errors() {
manageRolesPage.isRolesListDisplayed();
}
@Then("each role should show the correct Role Name, Type, and Status")
public void each_role_should_show_the_correct_role_name_type_and_status() {
manageRolesPage.verifyRolesDetails();
}
@Then("the list should be scrollable if there are many roles")
public void the_list_should_be_scrollable_if_there_are_many_roles() {
manageRolesPage.isRolesListScrollable();
}
@When("the admin enters {string} in the search bar")
public void the_admin_enters_in_the_search_bar(String roleName) {
manageRolesPage.enterRoleInSearchBar(roleName);
}
@When("the admin clicks the search button")
public void the_admin_clicks_the_search_button() {
manageRolesPage.clicksOnSearchButton();
}
@Then("the roles list updates to show only matching roles")
public void the_roles_list_updates_to_show_only_matching_roles() {
manageRolesPage.isRolesListUpdated();
}
@Then("the correct roles are displayed based on the search term")
public void the_correct_roles_are_displayed_based_on_the_search_term() {
manageRolesPage.verifyCorrectRolesDisplayed();
}
@When("the admin clicks the Create button")
public void the_admin_clicks_the_create_button() {
manageRolesPage.clicksOnCreateButton();
}
@When("the admin enters a valid Role Name {string} in the Role Name field")
public void the_admin_enters_a_valid_role_name_in_the_role_name_field(String roleName) {
manageRolesPage.enterRoleName(roleName);
}
@When("the admin optionally enters a Description {string}")
public void the_admin_optionally_enters_a_description(String description) {
manageRolesPage.enterRoleDescription(description);
}
@When("the admin clicks the Create button in the modal")
public void the_admin_clicks_the_create_button_in_the_modal() {
manageRolesPage.clicksOnCreateButtonInModal();
}
@Then("a new role is created successfully")
public void a_new_role_is_created_successfully() {
manageRolesPage.isRoleCreatedSuccessfully();
}
@Then("the new role appears in the roles list")
public void the_new_role_appears_in_the_roles_list() {
manageRolesPage.isNewRoleDisplayedInList();
}
@Then("the modal closes after creation")
public void the_modal_closes_after_creation() {
manageRolesPage.isModalClosed();
}
@When("the admin clicks the edit icon for an existing role")
public void the_admin_clicks_the_edit_icon_for_an_existing_role() {
manageRolesPage.clicksOnEditIconForExistingRole();
}
@When("the admin modifies the Role Name to {string} or Description to {string}")
public void the_admin_modifies_the_role_name_or_description(String newRoleName, String newDescription) {
manageRolesPage.modifyRoleDetails(newRoleName, newDescription);
}
@When("the admin clicks the Save button")
public void the_admin_clicks_the_save_button() {
manageRolesPage.clicksOnSaveButton();
}
@Then("the role is updated successfully")
public void the_role_is_updated_successfully() {
manageRolesPage.isRoleUpdatedSuccessfully();
}
@Then("the updated details are reflected in the roles list")
public void the_updated_details_are_reflected_in_the_roles_list() {
manageRolesPage.verifyUpdatedDetailsInList();
}
@Then("a success message is displayed after saving")
public void a_success_message_is_displayed_after_saving() {
manageRolesPage.isSuccessMessageDisplayed();
}
@When("the admin locates an inactive role in the list")
public void the_admin_locates_an_inactive_role_in_the_list() {
manageRolesPage.locateInactiveRole();
}
@When("the admin clicks the toggle button to activate the role")
public void the_admin_clicks_the_toggle_button_to_activate_the_role() {
manageRolesPage.clicksOnToggleToActivateRole();
}
@Then("the role status changes to Active immediately")
public void the_role_status_changes_to_active_immediately() {
manageRolesPage.isRoleStatusActive();
}
@Then("the updated status is visible in the roles list")
public void the_updated_status_is_visible_in_the_roles_list() {
manageRolesPage.isUpdatedStatusVisible();
}
@Then("the admin refreshes the page")
public void the_admin_refreshes_the_page() {
manageRolesPage.refreshPage();
}
@Then("the status remains active after refreshing the page")
public void the_status_remains_active_after_refreshing_the_page() {
manageRolesPage.isStatusActiveAfterRefresh();
}
@When("the admin locates an active role in the list")
public void the_admin_locates_an_active_role_in_the_list() {
manageRolesPage.locateActiveRole();
}
@When("the admin clicks the toggle button to deactivate the role")
public void the_admin_clicks_the_toggle_button_to_deactivate_the_role() {
manageRolesPage.clicksOnToggleToDeactivateRole();
}
@Then("the role status changes to Inactive immediately")
public void the_role_status_changes_to_inactive_immediately() {
manageRolesPage.isRoleStatusInactive();
}
@Then("the status remains inactive after refreshing the page")
public void the_status_remains_inactive_after_refreshing_the_page() {
manageRolesPage.isStatusInactiveAfterRefresh();
}
@When("the user clicks the Cancel button in the modal")
public void the_user_clicks_the_cancel_button_in_the_modal() {
manageRolesPage.clicksOnCancelButtonInModal();
}
@Then("the modal should close without saving any data")
public void the_modal_should_close_without_saving_any_data() {
manageRolesPage.isModalClosedWithoutSaving();
}
@Then("the roles list should remain unchanged")
public void the_roles_list_should_remain_unchanged() {
manageRolesPage.isRolesListUnchanged();
}
@When("the user observes the pagination controls at the bottom of the roles list")
public void the_user_observes_the_pagination_controls_at_the_bottom_of_the_roles_list() {
manageRolesPage.arePaginationControlsVisible();
}
@When("the user clicks on the next page button")
public void the_user_clicks_on_the_next_page_button() {
manageRolesPage.clicksOnNextPageButton();
}
@Then("the roles list displays the correct roles for the selected page")
public void the_roles_list_displays_the_correct_roles_for_the_selected_page() {
manageRolesPage.isCorrectRolesDisplayedForSelectedPage();
}
@Then("the pagination controls function correctly, allowing navigation between pages")
public void the_pagination_controls_function_correctly_allowing_navigation_between_pages() {
manageRolesPage.arePaginationControlsFunctioningCorrectly();
}
@When("the user clicks on the previous page button")
public void the_user_clicks_on_the_previous_page_button() {
manageRolesPage.clicksOnPreviousPageButton();
}
@When("the user clicks on the column header for {string} to sort")
public void the_user_clicks_on_the_column_header_for_to_sort(String columnName) {
manageRolesPage.clicksOnColumnHeaderToSort(columnName);
}
@Then("the roles list is sorted correctly by {string}")
public void the_roles_list_is_sorted_correctly_by(String columnName) {
manageRolesPage.isRolesListSortedBy(columnName);
}
@When("the admin makes a change to a role")
public void the_admin_makes_a_change_to_a_role() {
manageRolesPage.makeChangeToRole();
}
@Then("the roles list displays the latest data reflecting all changes made")
public void the_roles_list_displays_the_latest_data_reflecting_all_changes_made() {
manageRolesPage.isLatestDataDisplayed();
}

@Given("the user enters {string} in the role name field")
public void the_user_enters_in_the_role_name_field(String roleName) {
manageRolesPage.enterRoleName(roleName);
}
@Then("the new role should appear in the roles list with the correct role name description")
public void the_new_role_should_appear_in_the_roles_list_with_the_correct_role_name_description() {
manageRolesPage.isRoleDisplayed("ValidRoleName");
}
@Then("the modal should close after creation")
public void the_modal_should_close_after_creation() {
manageRolesPage.isModalOpen();
}
@Given("the admin optionally enters a description")
public void the_admin_optionally_enters_a_description() {
manageRolesPage.enterRoleDescription("This is a valid description.");
}
@When("the admin clicks on the roles tab")
public void the_admin_clicks_on_the_roles_tab() {
manageRolesPage.clicksOnRolesTab();
}
@When("the user clicks the create button")
public void the_user_clicks_the_create_button() {
manageRolesPage.clicksCreateButton();
}
@Given("the user enters a description {string} in the optional field")
public void the_user_enters_a_description_in_the_optional_field(String description) {
manageRolesPage.enterRoleDescription(description);
}
@Given("the user enters a valid role name {string} in the role name field")
public void the_user_enters_a_valid_role_name_in_the_role_name_field(String roleName) {
manageRolesPage.enterRoleName(roleName);
}
@When("the admin clicks the refresh button or refreshes the page")
public void the_admin_clicks_the_refresh_button_or_refreshes_the_page() {
manageRolesPage.refreshPage();
}
@When("the admin modifies the role name or description")
public void the_admin_modifies_the_role_name_or_description() {
manageRolesPage.modifyRoleDetails("ModifiedRoleName", "Modified description.");
}
@Then("a new role should be created successfully with the provided details")
public void a_new_role_should_be_created_successfully_with_the_provided_details() {
manageRolesPage.isRoleDisplayed("ModifiedRoleName");
}
@When("the user clicks the create button in the modal")
public void the_user_clicks_the_create_button_in_the_modal() {
manageRolesPage.clicksCreateButtonInModal();
}
}