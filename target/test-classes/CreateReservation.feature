Feature: Create Movie Reservation
  Scenario: Create Movie Reservation for Single Person
    Given a user with "user@mail.com" email and "Gasho" name has logged in
    When the user opens movie reservation screen
    And the user selects "Avengers" movie
    And the user selects "Musala" room on "2023-01-01" date at "20:00" o'clock
    And the user selects "42B" seat
    And the user clicks on place button
    Then "Successful reservation!" message is returned to the user