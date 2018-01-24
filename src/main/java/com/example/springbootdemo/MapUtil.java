package com.example.springbootdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapUtil {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "apple0");
        map.put("5", "water");
        map.put("2", "pear");
        map.put("1", "apple");

        for (String key : map.keySet()) {
            System.out.println("key is : " + key + ", value is : "
                    + map.get(key));
        }

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());


        }
    }
}
