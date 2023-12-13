package week11;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapFrequencyOfChar {

    /*
    Map-- Frequency of Characters
    Write a method that prints the frequency of each character from a String.
     */
    public static void main(String[] args) {
        String str = "mississippi";
        System.out.println(frequencyOfChar(str));
    }

    public static Map<Character, Integer> frequencyOfChar(String str) {

        char[] charArray = str.toCharArray();
        Map<Character, Integer> myMap = new LinkedHashMap<>();

        for (char eachChar : charArray) {

            if (!myMap.containsKey(eachChar)) {
                myMap.put(eachChar, 0);
            }
            myMap.put(eachChar, myMap.get(eachChar) + 1);

        }
        return myMap;
    }

}
