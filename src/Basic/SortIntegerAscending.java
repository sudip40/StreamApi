package Basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntegerAscending {
//    Sort a list of integers in ascending order.
public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 3, 2, 8, 9, 9, 10, 8, 7, 7);
    List<Integer> res = list.stream().sorted((a,b)->a-b).collect(Collectors.toList());
    res.stream().forEach(e-> System.out.println(e));
}
}
