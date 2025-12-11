package Basic;

import java.util.Arrays;
import java.util.List;

public class CheckNoStartZ {
//    Check if no string starts with "Z".
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

    boolean res = list.stream().noneMatch(e->e.endsWith("Z"));
    System.out.println(res);

}
}
