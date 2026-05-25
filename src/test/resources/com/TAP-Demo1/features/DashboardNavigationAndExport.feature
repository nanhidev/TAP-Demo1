
@feature_dashboard_navigation_export
Feature: DashboardNavigationAndExport

  Background: 
    Given the user is on the Login Page

  @valid-login
  Scenario Outline: Dashboard Navigation and Export Functionality
    When I enter <username>
    And I enter <password>
    And I click the "Login" button
    And I wait for the system to process the login request
    Then the user should be redirected to the Dashboard page
    And no error messages are displayed
    And the Dashboard page should load completely with all elements visible

    Examples:
      | username         | password       |
      | valid_username   | valid_password  |

  @sidebar-options-visibility
  Scenario Outline: Verify Sidebar Menu Options on the Dashboard
    When the user observes the sidebar menu on the Dashboard
    And the user identifies all available menu options
    And the user checks for the presence of options like <menu_option_1>, <menu_option_2>, <menu_option_3>
    And the user verifies that each option is clickable
    And the user hovers over each option to check for tooltips
    And the user ensures that the sidebar is responsive and adjusts to screen size
    Then all expected sidebar options are displayed
    And each option is clickable and leads to the corresponding module
    And tooltips appear on hover (if applicable)

  Examples:
    | menu_option_1 | menu_option_2 | menu_option_3 |
    | Recruitment    | Reports       | Settings       |

  @verify_dashboard_navigation
  Scenario Outline: Dashboard Navigation and Export Functionality
    When the user clicks on the "<sidebar_option>" sidebar option
    And the user waits for the page to load
    Then the "<module_name>" module information should be displayed

  Examples:
    | sidebar_option | module_name   |
    | Recruitment    | Recruitment    |
    | Reports        | Reports        |

  @navigate_to_dashboard
  Scenario Outline: Dashboard Navigation and Export Functionality
    When the user clicks on the "Settings" sidebar option
    Then the "Settings" module loads without errors
    When the user clicks on the "Dashboard" sidebar option
    Then the user should be redirected back to the Dashboard page
    And the Dashboard page content should be displayed correctly
    And the sidebar should remain functional and visible

  Examples:
    | action                       |
    | Click on the "Settings"     |
    | Click on the "Dashboard"    |

  @verify_export_button
  Scenario Outline: Verify Export Button Presence and Functionality
    When I observe the Dashboard page layout
    And I look for the Export button
    And I check the button's label and design
    And I verify the button's position on the page
    And I ensure the button is enabled and clickable
    And I check for any tooltips or help text associated with the button
    Then the Export button is present on the Dashboard page
    And the button is clearly labeled "<button_label>"
    And the button is visually distinct and clickable
    And tooltips or help text appear on hover (if applicable)

    Examples:
      | button_label |
      | Export       |

  @export_functionality
  Scenario Outline: Dashboard Navigation and Export Functionality
    When the user clicks the "Export" button on the Dashboard
    And the user waits for the system to process the export request
    Then a download prompt should appear for the user
    And the user selects the download location (if prompted)
    And the user opens the downloaded file
    Then the downloaded file should be in the correct format (.xlsx)

    Examples:
      | action                       |
      | Click the "Export" button   |
      | Wait for the export request  |
      | Observe the download prompt   |
      | Select the download location  |
      | Open the downloaded file      |
      | Verify the file format       |

@verify_report_data
Scenario Outline: Verify that the downloaded report contains valid data and is not corrupted
  Given the user has downloaded the report from the Dashboard
  When the user opens the downloaded report file
  Then the report file opens without errors
  And the report contains valid and relevant data
  And all expected headers are present in the report
  And the data matches the information displayed on the Dashboard
  And the file can be opened in Excel without issues

Examples:
  | report_file |
  | <report_file> |

@responsive-sidebar-menu
Scenario Outline: Dashboard Navigation and Export Functionality
  When the user resizes the browser window to a smaller width
  Then the sidebar menu adjusts appropriately to smaller screen sizes
  When the user checks the sidebar menu layout
  Then all sidebar options remain functional when clicked
  When the user resizes the browser back to a larger width
  Then the sidebar returns to its original layout on larger screens

Examples:
  | action                       |
  | Resize to smaller width      |
  | Check sidebar menu layout     |
  | Resize to larger width       |

  @successful-export
  Scenario Outline: Dashboard Navigation and Export Functionality
    When the user clicks the "Export" button on the Dashboard
    And the user waits for the system to process the export request
    And the user observes any success messages displayed
    And the user checks for visual indicators during processing
    Then a success message is displayed after the export is completed
    And visual indicators show that the export is in progress
    And the download prompt appears after the success message

  Examples:
    | action                       |
    | Click the "Export" button   |
    | Wait for processing          |
    | Observe success messages     |
    | Check visual indicators      |
    | Verify download prompt       |
