package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitList {
//    Limit a list to only 5 elements.
public static void main(String[] args) {
    List<Integer> list = Arrays.asList(
            10, 20, 30, 40, 50, 60, 70, 80, 90
    );

    List<Integer> res = list.stream().limit(5).collect(Collectors.toList());
    res.stream().forEach(e-> System.out.println(e));
}
}
