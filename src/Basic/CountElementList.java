package Basic;

import java.util.Arrays;
import java.util.List;

public class CountElementList {
//    Count how many elements are present in a list.
public static void main(String[] args) {
    List<String> list = Arrays.asList(
            "Apple",
            "Banana",
            "Avocado",
            "Mango",
            "Apricot",
            "Berry",
            "Almond",
            "Cherry",
            "Aster",
            "Pineapple"
    );

    long count = list.stream().count();
    System.out.println(count);
}
}
