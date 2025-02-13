package Second;
//6 Demonstrate the use of  addFirst(), addLast, removeFirst(), removeLast, getFirst(), getLast(), reversed() in Set and List Sequenced collections

import java.util.*;

public class Ques6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addLast(4);
        list.addFirst(1);
        list.addAll(List.of(1,3,1,4,7,32,11));
        System.out.println(list.toString());
        list.removeFirst();
        list.removeLast();
        System.out.println(list.toString());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.reversed());

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.addAll(List.of(1,3,1,4,7,32,11));
        set.addFirst(19);
        set.addLast(20);
        System.out.println(set.toString());
        set.removeFirst();
        set.removeLast();
        System.out.println(set.toString());
        System.out.println(set.getFirst());
        System.out.println(set.getLast());
        System.out.println(set.reversed());
    }
}
