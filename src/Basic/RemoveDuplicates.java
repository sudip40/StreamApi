package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
//    Remove duplicate elements from a list.
public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 3, 2, 8, 9, 9, 10, 8, 7, 7);
    // using set
    list.stream().collect(Collectors.toSet()).stream().forEach(e-> System.out.println(e));

    // using distinct
    list.stream().distinct().forEach(e-> System.out.println(e));
}
}
