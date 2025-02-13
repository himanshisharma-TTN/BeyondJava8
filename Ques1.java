package BeyondJava8;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ques1 {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1,11).boxed().toList();
        Stream.iterate(0,i->i+10).limit(20).forEach(System.out::println);
        System.out.println("------");
        Stream.iterate(0,i->i<10,i->i+1).forEach(System.out::println);

    }
}
