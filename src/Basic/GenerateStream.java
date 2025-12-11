package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GenerateStream {
//    Generate a stream of 10 random integers.
public static void main(String[] args) {
    List<Integer> list = Arrays.asList(5, 3, 9, 1, 4, 3, 8, 6, 5, 9, 2, 7);
    Stream<Integer> stream = list.stream();
    System.out.println(stream);
}
}
