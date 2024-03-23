package datastructures;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>() {{
            put("A", 3);
            put("B", 2);
            put("C", 1);
        }};

        List<Map.Entry<String, Integer>> l = new ArrayList<>(unsortedMap.entrySet());
        l.sort(Map.Entry.comparingByValue());
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> e : l) {
            sortedMap.put(e.getKey(), e.getValue());
        }
        for(Map.Entry<String, Integer> e: sortedMap.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }
}
