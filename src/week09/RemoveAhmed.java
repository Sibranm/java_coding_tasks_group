package week09;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmed {
    /*
    2) ArrayList - Remove "Ahmed"
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed

     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(removeName(list));
    }

    public static ArrayList<String> removeName(ArrayList<String> list){

        list.removeAll(Arrays.asList("Ahmed"));
        return list;

    }
}
