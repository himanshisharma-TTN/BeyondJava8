package Second;

//7 Demonstrate the use of firstEntry(), lastEntry(), pollFirstEntry(), pollLastEntry(), putFirst(), putLast(), reversed() with SequencedMap.

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Queue;

public class Ques7 {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.putFirst("Himanshi",21);
        map.putLast("Himanshi",22);
        map.put("Priyanka",25);
        map.put("Kanika",12);
        map.put("Sheetal",52);
        map.put("Simran",32);

        System.out.println(map.toString());
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());
        System.out.println(map.toString());
        System.out.println(map.reversed());
        System.out.println(map.toString());
    }
}
