package Basic;

import java.util.Arrays;
import java.util.List;

public class ConvertListToStreamAndPrint {
//    Convert a list into a stream and print each element.
public static void main(String[] args) {
    List<Integer> list = Arrays.asList(10, 22, 35, 49, 50, 51, 63, 12, 5, 99);
    list.stream().forEach(e-> System.out.println(e));
}
}
