package Basic;

import java.util.Arrays;
import java.util.List;

public class LastFromList {
    //    Find the first element from a list using Stream.
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 3, 2, 8, 9, 9, 10, 8, 7, 7);
        Integer i = list.stream().reduce((a,b)->b).get();

        Integer y = list.stream().filter(e->e%2==0).reduce((a,b)->b).get();

        System.out.println(i+" "+y);
    }
}
