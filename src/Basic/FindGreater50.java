package Basic;

import java.util.Arrays;
import java.util.List;

public class FindGreater50 {
//    Find if any number in a list is greater than 50.
public static void main(String[] args) {
    List<Integer> list = Arrays.asList(10, 22, 35, 49, 50, 51, 63, 12, 5, 99);
    boolean res = list.stream().anyMatch(e->e>50);
    System.out.println(res);
}
}
