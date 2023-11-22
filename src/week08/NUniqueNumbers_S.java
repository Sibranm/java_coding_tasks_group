package week08;

import java.util.Arrays;

public class NUniqueNumbers_S {
    /*
    Array - N unique integers that sum up to 0
    Write a function that given an integer N (1 < N < 100), returns an array
    containing N unique integers that sum up to 0. The function can return any
    such array.
    For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1] (but there are many more
    correct answers).
     */
    public static void main(String[] args) {
        System.out.println("nUniqueNumbers(4) = " + Arrays.toString(nUniqueNumbers(4)));
    }

    public static int[] nUniqueNumbers(int n){

//        int[] arr = new int[n];
//        Random randomNum = new Random();
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//
//            int num = randomNum.nextInt();
//
//            arr[i] = num;
//
//            if(i >= 1) {
//                if (arr[i] == arr[i - 1]) {
//                    i--;
//                    continue;
//                }
//            }
//            sum += arr[i];
//
//            if(i == arr.length -1){
//                arr[i] =  -sum;
//            }
//
//        }
//
//        return arr;
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {

            if(i != arr.length -1){
                arr[i] = (int) (Math.random() * 10);

                if (i >= 1) {
                    for (int j = 0; j < i; j++) {
                        if(arr[i] == arr[j]){
                            i--;
                            break;
                        }
                    }
                }
                sum += arr[i];

            }else{
                arr[i] =  -sum;
            }

        }

        return arr;

    }
}
