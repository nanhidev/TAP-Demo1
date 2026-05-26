package com.tap_demo1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tap_demo1.utils.ElementUtils;
import org.junit.Assert;

public class Sheet1Page {
    private WebDriver driver;
    private ElementUtils elementUtils;

    public Sheet1Page(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "candidateProfilesSearchPage") // Unique locator for Candidate Profiles Search Page
    private WebElement candidateProfilesSearchPage;

    @FindBy(id = "naturalLanguageQuery") // Unique locator for the natural language query input
    private WebElement naturalLanguageQueryInput;

    @FindBy(id = "searchButton") // Unique locator for the search button
    private WebElement searchButton;

    @FindBy(id = "relevantProfiles") // Unique locator for relevant candidate profiles display
    private WebElement relevantProfilesDisplay;

    public void navigateToCandidateProfilesSearchPage() {
        try {
            driver.get("http://localhost/candidateProfilesSearch"); // Navigating to the page
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterNaturalLanguageQuery(String query) {
        try {
            elementUtils.clearAndSendKeys(naturalLanguageQueryInput, query);
            elementUtils.clickElement(searchButton); // Triggering search
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areRelevantCandidateProfilesDisplayed() {
        try {
            boolean isElementDisplayed = elementUtils.isElementDisplayed(relevantProfilesDisplay);
            Assert.assertTrue("Relevant candidate profiles are not displayed!", isElementDisplayed);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}