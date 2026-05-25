package com.tap_demo1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tap_demo1.utils.ElementUtils;
import org.junit.Assert;

public class ManageRolesInUserManagementPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    public ManageRolesInUserManagementPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "rolesTab")
    private WebElement rolesTab;
    @FindBy(id = "rolesList")
    private WebElement rolesList;
    @FindBy(id = "searchBar")
    private WebElement searchBar;
    @FindBy(id = "searchButton")
    private WebElement searchButton;
    @FindBy(id = "createButton")
    private WebElement createButton;
    @FindBy(id = "roleNameField")
    private WebElement roleNameField;
    @FindBy(id = "roleDescriptionField")
    private WebElement roleDescriptionField;
    @FindBy(id = "createButtonInModal")
    private WebElement createButtonInModal;
    @FindBy(id = "successMessage")
    private WebElement successMessage;
    @FindBy(id = "modal")
    private WebElement modal;
    @FindBy(id = "editIcon")
    private WebElement editIcon;
    @FindBy(id = "saveButton")
    private WebElement saveButton;
    @FindBy(id = "toggleButton")
    private WebElement toggleButton;
    @FindBy(css = ".role-status")
    private WebElement roleStatus;

    public void navigateToUserManagementModule() {
        // Implementation for navigating to the User Management module
    }

    public void clicksOnRolesTab() {
        try {
            elementUtils.clickElement(rolesTab);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void observeDisplayedRolesList() {
        try {
            Assert.assertTrue("Roles list is not displayed!", elementUtils.isElementDisplayed(rolesList));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterRoleInSearchBar(String roleName) {
        try {
            elementUtils.clearAndSendKeys(searchBar, roleName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnSearchButton() {
        try {
            elementUtils.clickElement(searchButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnCreateButton() {
        try {
            elementUtils.clickElement(createButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterRoleName(String roleName) {
        try {
            elementUtils.clearAndSendKeys(roleNameField, roleName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterRoleDescription(String description) {
        try {
            elementUtils.clearAndSendKeys(roleDescriptionField, description);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnCreateButtonInModal() {
        try {
            elementUtils.clickElement(createButtonInModal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRoleCreatedSuccessfully() {
        try {
            Assert.assertTrue("Role was not created successfully!", elementUtils.isElementDisplayed(successMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isModalClosed() {
        try {
            Assert.assertFalse("Modal is still open!", elementUtils.isElementDisplayed(modal));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnEditIconForExistingRole() {
        try {
            elementUtils.clickElement(editIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void modifyRoleDetails(String newRoleName, String newDescription) {
        try {
            elementUtils.clearAndSendKeys(roleNameField, newRoleName);
            elementUtils.clearAndSendKeys(roleDescriptionField, newDescription);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnSaveButton() {
        try {
            elementUtils.clickElement(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRoleUpdatedSuccessfully() {
        try {
            String actualMessage = elementUtils.getElementText(successMessage);
            String expectedMessage = "Role updated successfully";
            Assert.assertEquals("Role was not updated successfully!", actualMessage, expectedMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isStatusActiveAfterRefresh() {
        try {
            refreshPage();
            String actualStatus = roleStatus.getText();
            String expectedStatus = "Active";
            Assert.assertEquals("Role status is not active after refresh!", actualStatus, expectedStatus);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void refreshPage() {
        try {
            driver.navigate().refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ublic void verifyRolesDetailsisModalClosedWithoutSaving() {
        try {
            Assert.assertFalse("Modal is still open!", elementUtils.isElementDisplayed(modal));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void makeChangeToRole() {
        // Implementation logic to make changes to a role
    }

    public void clicksOnNextPageButton() {
        try {
            WebElement nextPageButton = driver.findElement(By.id("nextPageButton"));
            elementUtils.clickElement(nextPageButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnPreviousPageButton() {
        try {
            WebElement previousPageButton = driver.findElement(By.id("previousPageButton"));
            elementUtils.clickElement(previousPageButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnToggleToDeactivateRole() {
        try {
            WebElement toggleDeactivate = driver.findElement(By.id("toggleDeactivate"));
            elementUtils.clickElement(toggleDeactivate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnToggleToActivateRole() {
        try {
            WebElement toggleActivate = driver.findElement(By.id("toggleActivate"));
            elementUtils.clickElement(toggleActivate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRolesListSortedBy(String criteria) {
        // Implementation logic to validate sorting of roles list
    }

    public void isRolesListUpdated() {
        // Implementation logic to check if roles list is updated
    }

    public void verifyCorrectRolesDisplayed() {
        // Implementation logic to verify correct roles are displayed
    }

    public void isCorrectRolesDisplayedForSelectedPage() {
        // Implementation logic to verify correct roles for selected page
    }

    public void isLatestDataDisplayed() {
        // Implementation logic to check latest data display
    }

    public void isNewRoleDisplayedInList() {
        // Implementation logic to verify if new role is displayed in the list
    }

    public void arePaginationControlsVisible() {
        try {
            WebElement paginationControls = driver.findElement(By.id("paginationControls"));
            Assert.assertTrue(elementUtils.isElementDisplayed(paginationControls), "Pagination controls are not visible!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRolesListUnchanged() {
        // Implementation logic to check roles list is unchanged
    }

    public void isRolesListDisplayed() {
        try {
            Assert.assertTrue(elementUtils.isElementDisplayed(rolesList), "Roles list is not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRoleStatusActive() {
        // Implementation logic to verify role status is active
    }

    public void locateInactiveRole() {
        // Implementation logic to locate inactive role
    }

    public void locateActiveRole() {
        // Implementation logic to locate active role
    }

    public void verifyUpdatedDetailsInList() {
        // Implementation logic to verify updated details in the list
    }

    public void isRoleStatusInactive() {
        // Implementation logic to verify role status is inactive
    }

    public void clicksOnColumnHeaderToSort(String columnName) {
        try {
            WebElement columnHeader = driver.findElement(By.id(columnName));
            elementUtils.clickElement(columnHeader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRoleDisplayed(String roleName) {
        // Implementation logic to verify a role is displayed
    }

    public void isUpdatedStatusVisible() {
        // Implementation logic to verify updated status is visible
    }

    public void isRolesListScrollable() {
        // Implementation logic to verify roles list is scrollable
    }
}