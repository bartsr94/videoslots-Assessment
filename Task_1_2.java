import java.util.Locale;
import java.util.Scanner;

public class Task_1_2 {

    public static void main(String[] args) {
        String userInput;
        StringBuilder reversed = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        userInput = sc.nextLine().trim().toLowerCase();

        for (int i = userInput.length() - 1; i >= 0; i--)
            reversed.append(userInput.charAt(i));

        if (userInput.equals(reversed.toString()))
            System.out.println(userInput + " is a palindrome");
        else
            System.out.println(userInput + " is not a palindrome");
    }
}