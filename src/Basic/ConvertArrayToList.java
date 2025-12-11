package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayToList {
//    Convert an array of integers into a list using stream.
public static void main(String[] args) {
    int[] arr = {4, 9, 15, 22, 31, 7, 18, 27};
    List<Integer> list = Arrays.stream(arr)
            .boxed()
            .collect(Collectors.toList());
    list.stream().forEach(e-> System.out.println(e));
}
}
