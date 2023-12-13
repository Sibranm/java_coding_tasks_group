package week10;

import java.util.*;

public class SortArrDesc {
    /*
    ArrayList - sorting in descending order
    Write a method that can sort the ArrayList in descending order without
    using the sort method.
     */

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12,33,22));
        System.out.println(sortDesc(list));

    }

    public static List<Integer> sortDesc(List<Integer> list){

        Set<Integer> set = new TreeSet<>(list);
        ArrayList<Integer> myList = new ArrayList<>(set);
        Collections.reverse(myList);

        return myList;


    }
}
