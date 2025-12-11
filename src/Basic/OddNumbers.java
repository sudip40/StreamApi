package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbers {
    //   Filter all odd numbers from a list.
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 9, 1, 4, 3, 8, 6, 5, 9, 2, 7);
        List<Integer> oddList = list.stream().filter(e->e%2!=0).collect(Collectors.toList());
        oddList.stream().forEach(e-> System.out.println(e));
    }
}
