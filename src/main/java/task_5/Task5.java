package task_5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        String str1 = "Hello world!";
        String str2 = "What`s app?";
        String str3 = "My name is Svit!";
        List<String> listStr = new ArrayList<>(List.of(str1, str2, str3));
        System.out.println(listStr.stream()
                .sorted((String::compareTo))
                .toList());
        System.out.println(listStr.stream()
                .sorted(((o1, o2) -> o2.compareTo(o1)))
                .toList());
    }
}
