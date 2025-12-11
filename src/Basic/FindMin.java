package Basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMin {
//    Find min value from a list using Stream.
public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 3, 2, 8, 9, 9, 10, 8, 7, 7);

    int a = list.stream().mapToInt(e->e).min().orElseThrow();

    Integer b = list.stream().min((x,y)->x-y).get();

    Integer c = list.stream().min(Comparator.comparingInt(x->x)).get();

    Integer d = list.stream().min((x,y)->x.compareTo(y)).get();

    System.out.println(a+" "+b+" "+c+" "+d);
}
}
