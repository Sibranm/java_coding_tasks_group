package week06;

public class ArrayFindMax {
    public static void main(String[] args) {
        int[] arr = {11, -1, 9, 9, 10, -9};
        System.out.println("maxInArray(arr) = " + maxInArray(arr));
    }
    /*
    Array -- Find Maximum
    Write a method that can find the maximum number from an int Array
     */


    public static int maxInArray(int[] arr){

        int max = arr[0];
        for (int each : arr) {
            if(each > max){
                max = each;
            }
        }
        return max;
    }
}
