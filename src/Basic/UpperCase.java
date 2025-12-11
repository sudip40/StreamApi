package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
//    Convert a list of strings to uppercase.
public static void main(String[] args) {
    List<String> list = Arrays.asList(
            "hello",
            "world",
            "stream",
            "practice",
            "java",
            "coding"
    );

    List<String> res = list.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
    res.stream().forEach(e-> System.out.println(e));
}
}
