Feature: Palindrome Function Testing

  Scenario Outline: Task 1_2: Palindrome
    Given User inputs the word "<pali>" that is a palindrome into the function
    When they executes Task_1_2 function
    Then the output prints that the word is a palindrome

    Examples:
    |pali|
    |otto|

  Scenario Outline: Task 1_2: Not a Palindrome
    Given User inputs the word {pali} that is not a palindrome into the function
    When they executes Task_1_2 function
    Then the output prints that the word is not a palindrome

    Examples:
    |pali|
    |robert|

  Scenario Outline: Task 1_2: Upper case letters
    Given User inputs the word {pali} that is a palindrome into the function
    And they ensures that some of the letters are capitalized in their chosen word
    When they executes Task_1_2 function
    Then the output prints that the word is a palindrome

    Examples:
      |pali|
      |Otto|

  Scenario Outline: Task 1_2: Numbers
    Given User inputs the word {pali} that is a palindrome into the function
    And they ensures that instead of letters numbers are used
    When they executes Task_1_2 function
    Then the output prints that the word is a palindrome

    Examples:
      |pali|
      |111222111|

  Scenario Outline: Task 1_2: Start or End Spaces
    Given User inputs the word {pali} that is a palindrome into the function
    And they ensures that a spaces are added to the start or end of their input
    When they executes Task_1_2 function
    Then the output prints that the word is a palindrome

    Examples:
      |pali|
      |  111222111|