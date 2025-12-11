package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToString {
//    Convert list to comma-separated string using joining.
public static void main(String[] args) {
    List<String> list = Arrays.asList(
            "Java",
            "Spring",
            "Microservices",
            "Kafka",
            "Docker",
            "Kubernetes"
    );

    String res = list.stream().collect(Collectors.joining(", "));
    System.out.println(res);
}
}
