Feature: Multiple of 4, 6 Function testing

  Scenario: Task 1_1: Multiples of 4, 6 or both
    Given User inputs array of integers into exampleArr
    When they executes Task_1_1 function
    Then the output prints out all variables that are multiples of 4 or 6 or both

  Scenario: Task_1_1: Negative and positive numbers
    Given User inputs array of negative and positive integers into exampleArr
    When they executes Task_1_1 function
    Then the output prints out all variables that are multiples of 4 or 6

  Scenario: Task_1_1: String into exampleArr
    Given User inputs array of integers including some decimal values into exampleArr
    When they executes Task_1_1 function
    Then the system notifies the user that only integers can be used

  Scenario: Task_1_1: Decimal into exampleArr
    Given User inputs array of integers including some decimal values into exampleArr
    When they executes Task_1_1 function
    Then the system notifies the user that only whole numbers can be used

