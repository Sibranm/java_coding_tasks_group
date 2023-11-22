package week08;

import java.util.Arrays;

public class Array_NUnique {

    public static void main(String[] args) {


        int number = 6;
        int[] array = zeroSum(number);
        System.out.println(Arrays.toString(array));
    }
    /*
    Write a function that given an integer N (1 < N < 100), returns an array
    containing N unique integers that sum up to 0. The function can return any
    such array.
    For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1] (but there are many more
    correct answers).
     */

    public static int[] zeroSum(int number){

        int[] result = new int[number];
        int sum = 0;

        for (int i = 0; i < number-1; i++) {
            result[i] = i + 1;
            sum += result[i];

        }
        result[number - 1] = -sum;

        return result;



    }


}
