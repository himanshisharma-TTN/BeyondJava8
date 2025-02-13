package BeyondJava8;

//3 Use Of method to create List, Set and Map

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ques3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,1,5);
        System.out.println(list);
        //This will give runtime error list.add(6);

        Set<String> set = Set.of("Himanshi", "Krishna", "Shivangi");
        System.out.println(set);

        Map<String, Integer> map = Map.of("Priyanka", 10, "Simran", 20, "Divya", 30);
        System.out.println(map);

    }
}
