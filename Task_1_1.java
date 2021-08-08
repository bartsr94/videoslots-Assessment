public class Task_1_1 {

    // This function checks if the values provided in exampleArr are multiples of 4 and 6
    public static void main(String[] args) {
        //Example Array of integers
        int[] exampleArr = {4,6,8,24,20,19,18,16,15,14,12,11,9,64,644};
        // Enhanced For loop that goes through all the values of exampleArr
        for (int x : exampleArr) {
            // If statement that checks if the value for x is equally divisible by 4 or 6 respectively
            if (x % 4 == 0 || x % 6 == 0) {
                // If the value is divisible by either 4 or 6 it gets printed out
                System.out.println(x);
            }
        }
    }
}