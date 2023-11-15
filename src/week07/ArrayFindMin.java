package week07;

public class ArrayFindMin {
    /*
    Question1: Array - Find Minimum
    Write a method that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        int[] arr = {-11, -1, 0, 9, 99, 10, -9};
        System.out.println("findMin(arr) = " + findMin(arr));
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int each : arr) {
            if(min > each){
                min = each;
            }
        }

        return min;
    }

}
