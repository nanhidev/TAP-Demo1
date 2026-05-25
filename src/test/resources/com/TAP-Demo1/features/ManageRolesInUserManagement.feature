
@feature_manage_roles
Feature: ManageRolesInUserManagement

  Background: 
    Given the user is in the User Management module

  @roles_list_display
  Scenario Outline: Manage Roles in User Management Module
    When the user clicks on the Roles tab
    And the user observes the displayed roles list
    Then the roles list should be displayed without errors
    And each role should show the correct Role Name, Type, and Status
    And the list should be scrollable if there are many roles

  Examples:
    | Role Name | Type   | Status  |
    | Admin     | Full   | Active  |
    | User      | Limited| Active  |
    | Guest     | None   | Inactive|

  @search-role
  Scenario Outline: Admin searches for a specific role using the search bar
    When the admin clicks on the Roles tab
    And the admin enters <role_name> in the search bar
    And the admin clicks the search button
    Then the roles list updates to show only matching roles
    And the correct roles are displayed based on the search term

    Examples:
      | role_name |
      | Admin     |

@create-new-role
Scenario Outline: Manage Roles in User Management Module
  When the admin clicks on the Roles tab
  And the admin clicks the Create button
  And the admin enters a valid Role Name in the Role Name field
  And the admin optionally enters a Description
  And the admin clicks the Create button in the modal
  Then a new role is created successfully
  And the new role appears in the roles list
  And the modal closes after creation

  Examples:
    | role_name       | description                                   |
    | Admin           | This role is for managing user permissions.   |

  @create_role
  Scenario Outline: Manage Roles in User Management Module
    When the user clicks on the Roles tab
    And the user clicks the Create button
    And the user enters a valid Role Name "<role_name>" in the Role Name field
    And the user enters a Description "<description>" in the optional field
    And the user clicks the Create button in the modal
    Then a new role should be created successfully with the provided details
    And the new role should appear in the roles list with the correct Role Name and Description
    And the modal should close after creation

    Examples:
      | role_name        | description                                   |
      | Admin Role      | This role is for managing admin tasks.       |

  @update_role
  Scenario Outline: Manage Roles in User Management Module
    When the admin clicks on the Roles tab
    And the admin clicks the edit icon for an existing role
    And the admin modifies the Role Name or Description
    And the admin clicks the Save button
    Then the role is updated successfully
    And the updated details are reflected in the roles list
    And a success message is displayed after saving

  Examples:
    | Role Name       | Description          |
    | New Role Name   | New Role Description  |

  @activate_inactive_role
  Scenario Outline: Manage Roles in User Management Module
    When the admin clicks on the Roles tab
    And the admin locates an inactive role in the list
    And the admin clicks the toggle button to activate the role
    Then the role status changes to Active immediately
    And the updated status is visible in the roles list
    And the admin refreshes the page
    Then the status remains active after refreshing the page

  Examples:
    | username | password |
    | admin    | admin123 |

  @deactivate_role
  Scenario Outline: Manage Roles in User Management Module
    When the admin clicks on the Roles tab
    And the admin locates an active role in the list
    And the admin clicks the toggle button to deactivate the role
    Then the role status changes to Inactive immediately
    And the updated status is visible in the roles list
    And the admin refreshes the page
    Then the status remains inactive after refreshing the page

  Examples:
    |  |
    |  |

  @cancel_role_creation
  Scenario Outline: Manage Roles in User Management Module
    When the user clicks on the Roles tab
    And the user clicks the Create button
    And the user enters <role_name> in the Role Name field
    And the user clicks the Cancel button in the modal
    Then the modal should close without saving any data
    And the roles list should remain unchanged

    Examples:
      | role_name     |
      | Admin Role    |

  @roles_pagination
  Scenario Outline: Manage Roles in User Management Module
    When the user clicks on the Roles tab
    And the user observes the pagination controls at the bottom of the roles list
    And the user clicks on the next page button
    Then the roles list displays the correct roles for the selected page
    And the pagination controls function correctly, allowing navigation between pages
    And the user clicks on the previous page button

  Examples:
    | username | password |
    | user1    | pass1    |

  @verify_sorting_by_role_name
  Scenario Outline: Manage Roles in User Management Module
    When the user clicks on the Roles tab
    And the user clicks on the column header for <column_name> to sort
    Then the roles list is sorted correctly by <column_name>

    Examples:
      | column_name  |
      | Role Name    |
      | Type         |
      | Status       |

  @roles_refresh
  Scenario Outline: Manage Roles in User Management Module
    Given the admin clicks on the Roles tab
    When the admin makes a change to a role
    And the admin clicks the refresh button or refreshes the page
    Then the roles list displays the latest data reflecting all changes made

  Examples:
    | role_change          |
    | create               |
    | update               |
    | toggle status        |
