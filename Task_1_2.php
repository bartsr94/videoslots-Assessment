<?php
class Task_1_2
{
public static
    // This function checks if the string provided in 'example' is a palindrome or not
    function main($args)
    {
        // sample string is provided and then all characters are made lowercase and whitespaced stripped out
        $example = " Otto";
        $example = trim(strtolower($example));

        // strrev is used to reverse the string quickly
        $reversedExample =  strrev($example);

        // example is printed and if it is or isn't a palindrome is printed after it using the if statement
        print $example;

        if($example == $reversedExample){
            print " is a Palindrome";
        } else {
            print " is not a Palindrome";
        }
    }
}
Task_1_2::main(array());