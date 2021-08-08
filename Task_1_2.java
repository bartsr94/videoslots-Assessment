import java.util.Scanner;

public class Task_1_2 {
    // This function takes the user provided string and checks if it is a Palindrome or not
    public static void main(String[] args) {
        // Strings and scanner variables are defined
        String userInput;
        /* Use of StringBuilder allows me to later append the characters of
        userInput to variable 'reversed' once their order has been reversed by the For Loop below
        */
        StringBuilder reversed = new StringBuilder();
        // Scanner variable initialized
        Scanner sc = new Scanner(System.in);
        /* userInput gets provided, to ensure that values provided by the user are checked correctly I
        went ahead and removed whitespaces and made all the characters lowercase.
        */
        System.out.println("Enter a string:");
        userInput = sc.nextLine().trim().toLowerCase();

        // The for loop goes through and appends in reverse order all the characters provided in 'userInput' into variable 'reversed'
        for (int i = userInput.length() - 1; i >= 0; i--)
            reversed.append(userInput.charAt(i));

        // If else statement to check if the string provided by the user in 'userInput' is identical to 'reversed'
        // If it's a palindrome or not the user is notified
        if (userInput.equals(reversed.toString()))
            System.out.println(userInput + " is a palindrome");
        else
            System.out.println(userInput + " is not a palindrome");
    }
}