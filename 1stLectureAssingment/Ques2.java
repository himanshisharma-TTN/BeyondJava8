package BeyondJava8;

//2 Convert an Optional type into Stream

import java.util.stream.IntStream;

public class Ques2 {
    public static void main(String[] args) {
        System.out.println("Optional Stream like printing table");
        IntStream.iterate(4,i->i<10,i->i+1).
                findFirst().stream().
                mapMulti(
                        (el,consumer)->IntStream.iterate(1,i->i+1)
                        .limit(10).
                                forEach(num->consumer.accept(num*el))).
                forEach(System.out::println);

    }
}
