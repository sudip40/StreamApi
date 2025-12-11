package Basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMax {
//    Find max value from a list using Stream.
public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 3, 2, 8, 9, 9, 10, 8, 7, 7);

    int i = list.stream().mapToInt(e->e).max().orElseThrow();

    Integer oi = list.stream().max((a, b)->a-b).get();

    Integer oi1 = list.stream().max((a,b)->a.compareTo(b)).get();

    Integer oi2 = list.stream().max(Comparator.comparingInt(e->e)).get();

    System.out.println(i+" "+oi+" "+oi1+" "+oi2);
}
}
