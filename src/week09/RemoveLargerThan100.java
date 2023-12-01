package week09;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLargerThan100 {
    /*
    3) ArrayList - Remove some values
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 100, 200, 300));
        System.out.println(removeNum(list));
    }
    public static ArrayList<Integer> removeNum(ArrayList<Integer> list){

        list.removeIf(p -> p > 100);
        return list;

    }
}
