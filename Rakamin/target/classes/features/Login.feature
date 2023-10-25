Feature: Login

  Scenario: User login using registered user and password
    Given Open browser
    And Open website Saucedemo
    When User enters standard_user and secret_sauce
    And User click on login


  Scenario: Wrong username and password
    Given Open browser
    And Open website Saucedemo
    When User type username as Chairun
    And User type password as 123456
    And User click on login
    Then User should see Error

  Scenario: User Add To Cart
    Given Open browser
    And Open website Saucedemo
    When User enters standard_user and secret_sauce
    And User click on login
    And User Add To Cart

  Scenario: User View Cart
    Given Open browser
    And Open website Saucedemo
    When User enters standard_user and secret_sauce
    And User click on login
    And User Add To Cart
    And User view cart

  Scenario: User Checkout
    Given Open browser
    And Open website Saucedemo
    When User enters standard_user and secret_sauce
    And User click on login
    And User Add To Cart
    And User view cart
    And User checkout
    Then User type firstname as Chairun
    And User type lastname as Puspitasari
    And User type ZIP as 13810
    Then User click on continue
    And User back to home