package week04;

import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    /*
        String -- Remove Duplicates
    Write a return method that can remove the duplicated values from
    String
    Ex: removeDup("AAABBBCCC") ==> AB
     */
    public static void main(String[] args) {
        removeDuplicates("AAABBBCCC");
        removeDuplicates("ABCABCABC");
    }

    public static void removeDuplicates(String str) {

        String output = "";
        for (int i = 0; i < str.length(); i++) {

            String let = str.charAt(i) + "";
            if (!output.contains(let)) {
                output += let;
            }
        }

        System.out.println(output);}
        /* solution with array:
        String output = "";
        String [] arr = str.split("");
        for(int i = 0; i < arr.length; i++) {
            int frequency = Collections.frequency(Arrays.asList(arr), arr[i]);
            if(frequency >= 1){
               output += output.contains(arr[i]) ? "" : arr[i];
            }
        }
        System.out.println(output);
    }

         */
}
