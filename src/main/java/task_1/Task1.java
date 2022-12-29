package task_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        String str = "my name is Svit and name is Lana";
        Map<String, Integer> map = new HashMap<>();

        Stream.of(str.split("\\P{LD}"))
                .forEach(e -> {
                    map.merge(e, 1, (i1, i2) -> i1 + i2);
                    if(map.values().stream().reduce(Integer::sum).get() == str.split("\\P{LD}").length){
                        map.forEach((key, value) -> System.out.printf("%-5s %-5d%n", key,value));
                    }
                });
    }
}
