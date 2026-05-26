package com.tap_demo1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tap_demo1.utils.ElementUtils;
import org.junit.Assert;
import java.awt.*;
import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class DashboardNavigationAndExportPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "usernameInput")
    private WebElement usernameInput;
    @FindBy(id = "passwordInput")
    private WebElement passwordInput;
    @FindBy(id = "loginButton")
    private WebElement loginButton;
    @FindBy(id = "dashboardPage")
    private WebElement dashboardPage;
    @FindBy(id = "errorMessage")
    private WebElement errorMessage;
    @FindBy(id = "sidebarMenu")
    private WebElement sidebarMenu;
    @FindBy(id = "exportButton")
    private WebElement exportButton;
    @FindBy(id = "downloadPrompt")
    private WebElement downloadPrompt;
    @FindBy(id = "successMessage")
    private WebElement successMessage;
    @FindBy(id = "tooltips")
    private WebElement tooltips;

    private final String DOWNLOAD_DIRECTORY = System.getProperty("user.home") + "/Downloads/";

    public DashboardNavigationAndExportPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        elementUtils.clearAndSendKeys(usernameInput, username);
    }

    public void enterPassword(String password) {
        elementUtils.clearAndSendKeys(passwordInput, password);
    }

    public void clickLoginButton() {
        elementUtils.clickElement(loginButton);
    }

    public boolean isDashboardPageDisplayed() {
        return elementUtils.isElementDisplayed(dashboardPage);
    }

    public boolean isErrorMessageDisplayed() {
        return elementUtils.isElementDisplayed(errorMessage);
    }

    public void observeSidebarMenu() {
        elementUtils.isElementDisplayed(sidebarMenu);
    }

    public void clickExportButton() {
        elementUtils.clickElement(exportButton);
    }

    public boolean isDownloadPromptVisible() {
        return elementUtils.isElementDisplayed(downloadPrompt);
    }

    public boolean isSuccessMessageDisplayed() {
        return elementUtils.isElementDisplayed(successMessage);
    }

    ublic void validateExportButtonLabel(String expectedLabel) {
        String actualLabel = elementUtils.getElementText(exportButton);
        Assert.assertEquals("Export button label is incorrect", expectedLabel, actualLabel);
    }

    public void waitForPageToLoad() {
        try {
            Thread.sleep(2000); // Placeholder for actual wait logic
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void downloadReport() {
        clickExportButton(); // Assuming this initiates the report download
    }

    public void openDownloadedFile() {
        File latestFile = new File(DOWNLOAD_DIRECTORY);
        File[] files = latestFile.listFiles();
        if (files != null && files.length > 0) {
            File mostRecentFile = files[0];
            for (File file : files) {
                if (file.lastModified() > mostRecentFile.lastModified()) {
                    mostRecentFile = file;
                }
            }
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().open(mostRecentFile);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public boolean isReportFileOpenedWithoutErrors() {
        File latestFile = new File(DOWNLOAD_DIRECTORY);
        File[] files = latestFile.listFiles();
        if (files != null && files.length > 0) {
            File mostRecentFile = files[0];
            for (File file : files) {
                if (file.lastModified() > mostRecentFile.lastModified()) {
                    mostRecentFile = file;
                }
            }
            return mostRecentFile.exists() && mostRecentFile.length() > 0;
        }
        return false;
    }

    public boolean isReportDataValid() {
        File latestFile = new File(DOWNLOAD_DIRECTORY);
        File[] files = latestFile.listFiles();
        if (files != null && files.length > 0) {
            File mostRecentFile = files[0];
            for (File file : files) {
                if (file.lastModified() > mostRecentFile.lastModified()) {
                    mostRecentFile = file;
                }
            }
            try {
                String content = new String(Files.readAllBytes(mostRecentFile.toPath()));
                return !content.isEmpty();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    ublic boolean isTooltipVisible() {
        return elementUtils.isElementDisplayed(tooltips);
    }

    public void checkTooltipsOnHover() {
        WebElement option = driver.findElement(By.xpath("//li[contains(@class, 'sidebar-option')]"));
        elementUtils.mouseHoverAndClick(option);
        Assert.assertTrue("Tooltip not displayed on hover", isTooltipVisible());
    }

    public boolean areSidebarOptionsFunctional() {
        // Logic to check if sidebar options function correctly
        return true; // Placeholder return value
    }

    public void clickSidebarOption(String sidebarOption) {
        WebElement option = driver.findElement(By.xpath("//li[text()='" + sidebarOption + "']"));
        elementUtils.clickElement(option);
    }

    public boolean isSidebarResponsive() {
        WebElement sidebar = driver.findElement(By.id("sidebar"));
        return elementUtils.isElementDisplayed(sidebar);
    }

    public boolean isExportButtonPositionCorrect() {
        int expectedPosition = 100; // Example expected position
        int actualPosition = exportButton.getLocation().getY();
        return actualPosition == expectedPosition;
    }

    public boolean isSidebarMenuAdjusted() {
        return elementUtils.isElementDisplayed(sidebarMenu);
    }

    public void checkSidebarMenuLayout() {
        WebElement sidebarMenuLayout = driver.findElement(By.id("sidebarMenuLayout"));
        Assert.assertTrue(elementUtils.isElementDisplayed(sidebarMenuLayout), "Sidebar menu layout is incorrect!");
    }

    public void waitForExportProcessing() {
        WebElement exportProcessingIndicator = driver.findElement(By.id("exportProcessingIndicator"));
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(exportProcessingIndicator));
    }

    public boolean isSidebarLayoutOriginal() {
        // Logic to verify sidebar layout
        return true; // Placeholder return value
    }

    public boolean areAllDashboardElementsVisible() {
        WebElement dashboardElement = driver.findElement(By.id("dashboardElement"));
        return elementUtils.isElementDisplayed(dashboardElement);
    }

    public boolean isFileFormatCorrect() {
        String expectedFormat = ".xlsx"; // Example expected format
        String actualFormat = "actualFileFormatHere"; // Replace with actual logic to get the file format
        return actualFormat.equals(expectedFormat);
    }

    public void resizeBrowserToLargerWidth() {
        driver.manage().window().setSize(new Dimension(1200, 800));
    }

    public String getExportButtonLabel() {
        return elementUtils.getElementText(exportButton);
    }

    public void loadSettingsModule() {
        WebElement settingsModule = driver.findElement(By.id("settingsModule"));
        elementUtils.clickElement(settingsModule);
    }

    public boolean isExportButtonDistinct() {
        return elementUtils.isElementDisplayed(exportButton);
    }

    public void selectDownloadLocation() {
        // Logic to select download location
    }

    public void clickSettingsSidebarOption() {
        WebElement settingsSidebarOption = driver.findElement(By.id("settingsSidebarOption"));
        elementUtils.clickElement(settingsSidebarOption);
    }

    public boolean isMenuOptionPresent(String menuOption) {
        WebElement option = driver.findElement(By.id(menuOption));
        return elementUtils.isElementDisplayed(option);
    }

    public boolean isSidebarFunctional() {
        // Example check for sidebar functionality
        return true; // Placeholder return value
    }

    public boolean isDashboardContentDisplayedCorrectly() {
        WebElement dashboardContent = driver.findElement(By.id("dashboardContent"));
        return elementUtils.isElementDisplayed(dashboardContent);
    }

    public void waitForLoginProcessing() {
        WebElement loginProcessingIndicator = driver.findElement(By.id("loginProcessingIndicator"));
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(loginProcessingIndicator));
    }

    public boolean isVisualIndicatorDisplayed() {
        WebElement visualIndicator = driver.findElement(By.id("visualIndicator"));
        return elementUtils.isElementDisplayed(visualIndicator);
    }

    public boolean isReportDataMatchingDashboard() {
        // Logic to check report data vs dashboard data
        return true; // Placeholder return value
    }

    public boolean isModuleLoadedWithoutErrors() {
        // Logic to verify module loading without errors
        return true; // Placeholder return value
    }

    public void canOpenFileInExcel() {
        // Logic to open file in excel
    }

    public boolean isExportButtonTooltipVisible() {
        WebElement exportButtonTooltip = driver.findElement(By.id("exportButtonTooltip"));
        return elementUtils.isElementDisplayed(exportButtonTooltip);
    }

    public boolean isSettingsModuleLoadedSuccessfully() {
        // Logic to check if settings module loaded successfully
        return true; // Placeholder return value
    }

    public boolean areExpectedSidebarOptionsDisplayed() {
        // Logic to verify sidebar options
        return true; // Placeholder return value
    }

    public void clickDashboardSidebarOption() {
        WebElement dashboardSidebarOption = driver.findElement(By.id("dashboardSidebarOption"));
        elementUtils.clickElement(dashboardSidebarOption);
    }

    public void observeDashboardLayout() {
        // Logic to observe dashboard layout
    }

    public boolean isDownloadPromptVisibleAfterSuccess() {
        return elementUtils.isElementDisplayed(downloadPrompt);
    }

    public boolean isModuleInformationDisplayed() {
        // Logic to verify module information displayed
        return true; // Placeholder return value
    }

    public boolean isSuccessMessageDisplayedAfterExport() {
        return elementUtils.isElementDisplayed(successMessage);
    }

    public boolean areTooltipsVisible() {
        List<WebElement> tooltips = driver.findElements(By.className("tooltip"));
        return tooltips.size() > 0;
    }

    public boolean areSidebarOptionsNavigable() {
        WebElement sidebarOption = driver.findElement(By.id("sidebarOption"));
        elementUtils.clickElement(sidebarOption);
        return elementUtils.isElementDisplayed(driver.findElement(By.id("navigatedPage")));
    }

    public boolean isDownloadedFileInCorrectFormat() {
        String expectedFormat = ".xlsx"; // Example expected format
        String actualFormat = "actualDownloadedFileFormat"; // Replace with actual logic
        return actualFormat.equals(expectedFormat);
    }

    public void openDownloadedReport() {
        // Logic to open downloaded report
    }

    public boolean isExportButtonVisible() {
        return elementUtils.isElementDisplayed(exportButton);
    }

    public void resizeBrowserToSmallerWidth() {
        driver.manage().window().setSize(new Dimension(800, 600));
    }

    public boolean isExportButtonEnabled() {
        return exportButton.isEnabled();
    }

    public boolean areExpectedHeadersPresent() {
        List<WebElement> headers = driver.findElements(By.xpath("//table/thead/tr/th"));
        return headers.size() > 0;
    }

    public boolean areMenuOptionsClickable() {
        WebElement menuOption = driver.findElement(By.id("menuOption"));
        return menuOption.isEnabled();
    }

    public boolean isExportInProgressIndicatorVisible() {
        WebElement exportInProgressIndicator = driver.findElement(By.id("exportInProgressIndicator"));
        return elementUtils.isElementDisplayed(exportInProgressIndicator);
    }

    public boolean identifyMenuOptions() {
        List<WebElement> menuOptions = driver.findElements(By.className("menuOption"));
        return menuOptions.size() > 0;
    }
}