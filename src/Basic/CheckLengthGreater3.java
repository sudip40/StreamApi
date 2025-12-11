package Basic;

import java.util.Arrays;
import java.util.List;

public class CheckLengthGreater3 {
//    Check if all strings have length > 3.
public static void main(String[] args) {
    List<String> list = Arrays.asList(
            "Lion",
            "Tiger",
            "Elephant",
            "Monkey",
            "Giraffe",
            "Panther",
            "Cheetah",
            "Bear",
            "Wolf",
            "Hyena"
    );

    boolean res = list.stream().noneMatch(e->e.length()<=3);
    System.out.println(res);
}
}
