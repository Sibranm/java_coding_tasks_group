package week08;

import java.sql.Array;
import java.util.Arrays;

public class MoveZeros {
    /*
    Write a method that can move all the zeros to last indexes of the array (Do
    Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]
     */
    public static void main(String[] args) {

        int[] array = {5, 0, 0, 2, 7, 0, 3, 0, 4, 0};

        System.out.println("Given array is: " + Arrays.toString(array));
        moveZeros(array);
        System.out.println("Sorted array is: " + Arrays.toString(array));

    }

    public static void moveZeros(int[] numbers) {
        int indexNum = 0; //this is a counter help us to know where the next non-zero number should be placed

        for (int i = 0; i < numbers.length; i++) {//this loop goes through each number, checks if it is not a zero, and moves it to the end.
            if (numbers[i] != 0) {
                numbers[indexNum++] = numbers[i]; //if the number is not zero we wil put it in the first index = indexNum
            }

        }

         while (indexNum < numbers.length) {// this loop fills the remaining space with zero numbers. Once we moved all the non zero numbers to the front, we hae left some empty spaces with zero numbers. this will fil ou the remaining index with zeros
            numbers[indexNum++] = 0;
        }
    }
}



