package task_4;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("we", "wee", "qwer", "oooo");
        getListWithMaxLengthOfWords2(stream);
    }

    static void getListWithMaxLengthOfWords1(Stream<String> stream){
        Map<Integer, List<String>> map = stream
                .collect(Collectors.groupingBy(e -> e.length()));
        map.forEach((key, value) -> System.out.println(key +" " + value));

        List<String> list = map
                .entrySet()
                .stream()
                .max((o1, o2) -> o1.getKey() - o2.getKey())
                .map(e -> e.getValue())
                .get();
        System.out.println(list);
    }

    static void getListWithMaxLengthOfWords2(Stream<String> stream){
        List<String> list = stream
                .collect(Collectors.groupingBy(e -> e.length()))
                .entrySet()
                .stream().max((o1, o2) -> o1.getKey() - o2.getKey())
                .map(e -> e.getValue())
                .get();
        System.out.println(list);
    }
}
