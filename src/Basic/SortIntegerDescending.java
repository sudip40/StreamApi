package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntegerDescending {
//    Sort a list of strings in descending order.
public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 3, 2, 8, 9, 9, 10, 8, 7, 7);
    List<Integer> res = list.stream().sorted((a,b)->b-a).collect(Collectors.toList());
    res.stream().forEach(e-> System.out.println(e));
}
}
