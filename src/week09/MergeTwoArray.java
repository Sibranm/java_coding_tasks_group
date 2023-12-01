package week09;

import java.util.Arrays;

public class MergeTwoArray {
    /*
    1) Array - Concat two arrays
    Write a return method that can concat two arrays
     */
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        System.out.println(Arrays.toString(concatArray(arr1, arr2)));

    }

    public static int[] concatArray(int arr[], int arr2[]){

        int newArr[] = new int[arr.length+arr2.length];

        int i = 0;
        for (int each : arr) {
            newArr[i++] = each;
        }

        for (int other : arr2) {
            newArr[i++] = other;
        }

        return newArr;

    }
}
