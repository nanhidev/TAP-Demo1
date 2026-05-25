package com.tap_demo1.stepdefinitions;
import com.tap_demo1.utils.ElementUtils;
import org.junit.Assert;
import com.tap_demo1.driverfactory.DriverFactory;
import com.tap_demo1.pages.Sheet1Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Sheet1 extends DriverFactory {
Sheet1Page sheet1Page = new Sheet1Page(driver);
@Given("the user is on the Candidate Profiles Search Page")
public void the_user_is_on_the_candidate_profiles_search_page() {
sheet1Page.navigateToCandidateProfilesSearchPage();
}
@When("I enter a natural language query to search for candidates")
public void i_enter_a_natural_language_query_to_search_for_candidates(String query) {
sheet1Page.enterNaturalLanguageQuery(query);
}
@Then("the system should display relevant candidate profiles based on the query")
public void the_system_should_display_relevant_candidate_profiles_based_on_the_query() {
sheet1Page.areRelevantCandidateProfilesDisplayed();
}