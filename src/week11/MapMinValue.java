package week11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapMinValue {
    /*
    Map - Min value
    Write a method that can return the minimum value from a map (DO NOT
    use sort method)
     */
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",-9);
        map.put("b",-8);
        map.put("e",0);
        map.put("r",9);
        map.put("c",-11);

        System.out.println(minValue(map));

    }

    public static Integer minValue(Map<String, Integer> map){

        int result = 0;

        Set<Integer> set = new TreeSet<>();

        set.addAll(map.values());

        for (Integer integer : set) {
            result = integer;
            break;
        }

        return result;

    }
}
