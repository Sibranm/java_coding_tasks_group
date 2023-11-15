package week07;

import java.util.Arrays;

public class ArraySortAsc {
    /*
    Question2: Array - Sort Ascending
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */
    public static void main(String[] args) {
        int[] arr = {0, 10, 9, 8, 7, -1};
        System.out.println("sortArrAsc(arr) = " + Arrays.toString(sortArrAsc(arr)));
    }

    public static int[] sortArrAsc(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
