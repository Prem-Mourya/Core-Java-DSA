package DSA.HashingMap;
import java.util.*;
public class HashMappp {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // insert
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        map.put("Africa", 80);

//        System.out.println(map);

        // search
//        if(map.containsKey("India")) System.out.println("Key exists");
//        if(!map.containsKey("Norway")) System.out.println("Key not exists");

        // get value
//        System.out.println(map.get("India")); // if key exist return value of the key
//        System.out.println(map.get("Dubai")); // if key doesn't exist return null

        // iterate on map

        for(Map.Entry<String, Integer> e :map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
