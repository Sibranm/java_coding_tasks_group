package week05;

import java.util.Arrays;
import java.util.Collections;

public class StringReverse {
    /*
    String -- Reverse
    Write a return method that can reverse String
    Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {
        System.out.println(reverseString("ABCD"));
        System.out.println(reverseString("ABCDDCBA"));
    }

    public static String reverseString(String str){


//        StringBuilder reversed = new StringBuilder(str).reverse();
//        String output = String.valueOf(reversed);
//        return output;

//        String output = "";
//        for(int i = str.length()-1; i >= 0 ; i--){
//            output += str.charAt(i);
//        }
//        return output;

        String output = "";
        String[] arr = str.split("");
        Collections.reverse(Arrays.asList(arr));
        for(int i = 0; i < str.length(); i++){
            output += arr[i];
        }
        return output;



    }
}
