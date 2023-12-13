package week10;

import java.util.*;

public class SortArrAsc {
    /*
    ArrayList - sorting in ascending
    Write a method that can sort the ArrayList in Ascending order without using
    the sort method.
     */
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12,33,22));
        System.out.println(sortAsc(list));
    }

    public static List<Integer> sortAsc(List<Integer> list){

        Set<Integer> set = new TreeSet<>(list);
        System.out.println(set);
        ArrayList<Integer> myList = new ArrayList<>(set);

        return myList;

    }
}
