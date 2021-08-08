<?php

$example = " Otto";
$example = trim(strtolower($example));

$reversedExample =  strrev($example);

print $reversedExample;

if($example == $reversedExample){
    print " is a Palindrome";
} else {
    print " is not a Palindrome";
}
?>