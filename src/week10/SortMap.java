package week10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    /*
    SortMap - Sort the map by values
    Write a method that can sort the SortMap by values
     */
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("D",20);
        map.put("A",50);
        map.put("B",10);
        map.put("C",30);
        System.out.println(sortMap(map));
    }

    public static Map<String,Integer> sortMap(Map<String,Integer> map){

        Map<Integer, String> newMap = new HashMap<>();

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            newMap.put(stringIntegerEntry.getValue(),stringIntegerEntry.getKey());
        }

        Map<Integer,String> temMap = new TreeMap<>(newMap);

       Map<String,Integer> finalMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> integerStringEntry : temMap.entrySet()) {
            finalMap.put(integerStringEntry.getValue(),integerStringEntry.getKey());
        }
        return finalMap;





    }
}
