package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Squares {
//    Convert a list of integers to a list of squares using Stream.
public static void main(String[] args) {
    List<Integer> list = Arrays.asList(5, 3, 9, 1, 4, 3, 8, 6, 5, 9, 2, 7);
    List<Integer> res = list.stream().map(e->e*e).collect(Collectors.toList());
    res.stream().forEach(e->System.out.println(e));
}
}
