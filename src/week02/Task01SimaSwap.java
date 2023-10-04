package week02;

public class Task01SimaSwap {
     /*
    Swap two variables value without using a third variable
     */

    public static void main(String[] args) {
        swapNums(7, 19);
    }
    public static void swapNums(int num1, int num2) {

        int sum = num1 + num2;
        num1 = sum - num1;
        num2 = sum - num2;

        System.out.println(num1 + "," + num2);
    }
}
