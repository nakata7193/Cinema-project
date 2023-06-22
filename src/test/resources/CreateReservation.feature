Feature: Create Movie Reservation

  Scenario: Create Movie Reservation for Single Person
    Given a user with "user@mail.com" email and "Gasho" name has logged in
    When the user opens movie reservation screen
    And the user selects "Avengers" movie
    And the user selects "Musala" room on "2023-01-01" date at "20:00" o'clock
    And the user selects "42B" seat
    And the user clicks on place button
    Then "Successful reservation!" message is returned to the user

  Scenario: Create Movie Reservation with VIP seat
    Given a user with "user@mail.com" email and "Gasho" name has logged in
    When the user opens movie reservation screen
    And the user selects "Avengers" movie
    And the user selects "Musala" room on "2023-01-01" date at "20:00" o'clock
    And the user selects "VIP-1" seat
    And the user clicks on place button
    Then "Already reserved seat!" message is returned to the user

  Scenario: Create Movie Reservation on taken seat
    Given a user with "user@mail.com" email and "Gasho" name has logged in
    When the user opens movie reservation screen
    And the user selects "Avengers" movie
    And the user selects "Musala" room on "2023-01-01" date at "20:00" o'clock
    And the user selects "VIP-1" seat
    And the user clicks on place button
    Then "Successful reservation!" message is returned to the user

  Scenario: Create Movie Reservation which fails due to invalid seat
    Given a user with "user@mail.com" email and "Gasho" name has logged in
    When the user opens movie reservation screen
    And the user selects "Avengers" movie
    And the user selects "Musala" room on "2023-01-01" date at "20:00" o'clock
    And the user selects no seat
    And the user clicks on place button
    Then "Reservation failed!" message is returned to the user

  Scenario: Create Movie Reservation which fails due to invalid seat
    Given a user with "user@mail.com" email and "Gasho" name has logged in
    When the user opens movie reservation screen
    And the user selects "Avengers" movie
    And the user selects "Musala" room on "2023-01-01" date at "18:00" o'clock
    And the user selects "42B" seat
    And the user clicks on place button
    Then "Reservation must be placed at least 60 minutes before movie starts." message is returned to the user