package task_9;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task9 {
    public static void main(String[] args) throws Exception {
        String s = "AAGGTFFDDVVAA";

        if(!s.matches("^([A-Za-z]+)$")){
            throw new Exception("The string has more than just letters!");
        }
        else{
            char[] c = s.toCharArray();
            Stream<Character> characterStream = new String(c).chars().mapToObj(i -> (char)i);
            Map<Character, Integer> map = new HashMap<>();
            characterStream.forEach(e -> map.merge(e, 1, (i1, i2)-> i1 + i2));

            map.forEach((key, value) -> System.out.print(value + "" + key));
        }
    }
}
