<?php
class Task_1
{
    public static
    function main($args)
    {
        $exampleArr = array(4, 6, 8, 24, 20, 19, 18, 16, 15, 14, 12, 11, 9, 64);
        foreach($exampleArr as $x)
        {
            if ($x % 4 == 0 || $x % 6 == 0)
            {
                printf("%d\n", $x);
            }
        }
    }
}
Task_1::main(array());