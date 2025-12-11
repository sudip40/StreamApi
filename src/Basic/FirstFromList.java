package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstFromList {
//    Find the first element from a list using Stream.
public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 3, 2, 8, 9, 9, 10, 8, 7, 7);
    Integer i = list.stream().findFirst().get();
    System.out.println(i);
}
}
