package week01;

public class Task1_Suzana {
    public static void main(String[] args) {
        int number = 7; // The number we want to check

        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
