package Basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringLengthSorting {
//    Sort the list in ascending order of string length
//    Sort the list in descending order of string length
public static void main(String[] args) {
    List<String> names = Arrays.asList(
            "Sudip", "Rahul", "Amit", "Jonathan", "Li", "Christopher", "Sid"
    );
    List<String> resAsc = names.stream().sorted(Comparator.comparingInt(e->e.length())).collect(Collectors.toList());
    resAsc.stream().forEach(e-> System.out.println(e));

    List<String> resDesc =names.stream().sorted((a,b)->b.length()-a.length()).collect(Collectors.toList());
    resDesc.stream().forEach(e-> System.out.println(e));
}
}
