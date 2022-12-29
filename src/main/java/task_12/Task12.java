package task_12;
import java.util.stream.IntStream;

public class Task12 {
    public static void main(String[] args) {
        String str = "my name is Svit";
        System.out.println(reversString(str));
        System.out.println(reverseStringLambda(str));
    }

    static String reversString(String str){
        String[] strArray = str.split("\\P{L}");
        StringBuilder strBuilder = new StringBuilder();
        for (int i = strArray.length - 1; i >= 0; i--) {
            if(i != 0){
                strBuilder.append(strArray[i]).append(" ");
            }
            else{
                strBuilder.append(strArray[i]);
            }
        }
        return strBuilder.toString();
    }

    static String reverseStringLambda(String str){
        String[] strArray = str.split("\\P{L}");
        StringBuilder sb = new StringBuilder();
        IntStream.rangeClosed(1, strArray.length)
                .mapToObj(i -> strArray[strArray.length - i])
                .toList()
                .forEach(e -> {
                    sb.append(e + " ");
                });
        return sb.toString();
    }
}

