public class Task_1_1 {

    public static void main(String[] args) {
        int[] exampleArr = {4,6,8,24,20,19,18,16,15,14,12,11,9,64};
        for (int x : exampleArr) {
            if (x % 4 == 0 || x % 6 == 0) {
                System.out.println(x);
            }
        }
    }
}