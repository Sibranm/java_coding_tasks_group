package week04;

import java.util.Arrays;
import java.util.Collections;

public class SameLetters {

    public static void main(String[] args) {
        System.out.println(isSame("abcc", "cab"));
        System.out.println(isSame("abb", "cab"));
        System.out.println(isSame("   ", "c  "));
        System.out.println(isSame("&U7", "U&7"));
    }

    /*
    String -- Same letters
    Write a return method that check if a string is build out of the
    same letters as another string.
    Ex: same("abc", "cab"); -> true
    same("abc", "abb"); -> false:

     */
    public static boolean isSame(String str1, String str2) {

      /* solution without Array:
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                if (!str2.contains(str1.charAt(i) + "")) {
                    return false;
                }
            }

            for (int i = 0; i < str2.length(); i++) {
                if (!str1.contains(str2.charAt(i) + "")) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }*/

        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        Collections.sort(Arrays.asList(arr1));
        Collections.sort(Arrays.asList(arr2));

        if(Arrays.asList(arr1).equals(Arrays.asList(arr2))){
            return true;
        }else {
            return false;
        }
    }
}
