package week07;

import java.util.Arrays;

public class ArraySortDesc {
    /*
        Question3: Array - Sort Descending
        Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
        Ex: int[] arr = {10,20,7, 8, 90};
        arr = Sort(arr); ==> {90, 20, 10, 8, 7};
         */
    public static void main(String[] args){
        int[] arr = {0, 10, 9, 8, 7,-1};
        System.out.println("sortArrDesc(arr) = " + Arrays.toString(sortArrDesc(arr)));
    }

    public static int[] sortArrDesc(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;

    }
}
