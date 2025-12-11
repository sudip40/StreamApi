package Basic;

import java.util.Arrays;
import java.util.List;

public class CountA {
//    Count how many strings start with the letter "A".
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

    long count = list.stream().filter(e->e.startsWith("A")).count();
    System.out.println(count);
}
}
