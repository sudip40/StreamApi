package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
//    Filter all even numbers from a list.
public static void main(String[] args) {
    List<Integer> list = Arrays.asList(5, 3, 9, 1, 4, 3, 8, 6, 5, 9, 2, 7);
    List<Integer> evenList = list.stream().filter(e->e%2==0).collect(Collectors.toList());
    evenList.stream().forEach(e->System.out.println(e));
}
}
