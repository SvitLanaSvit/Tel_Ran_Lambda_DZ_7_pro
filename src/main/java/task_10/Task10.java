package task_10;

import java.util.List;
import java.util.stream.IntStream;

public class Task10 {
    public static void main(String[] args) {
        String str = "otiwuklft";
        int index = getIndexOfLetter(str, 't');
        getStringRes(index);

        int indexLambda = getIndexOfLetterLambda(str, 't');
        getStringRes(indexLambda);

        System.out.println(getIndexOfLetterLambdaList(str, 't'));
    }

    static int getIndexOfLetter(String str, char c){
        return str.indexOf(c);
    }

    static int getIndexOfLetterLambda(String str, char c){
        return IntStream.range(0, str.length())
                .filter(i -> str.charAt(i) == c)
                .findFirst()
                .getAsInt();
    }

    static List<Integer> getIndexOfLetterLambdaList(String str, char c){
        return IntStream.range(0, str.length())
                .filter(i -> str.charAt(i) == c)
                .boxed()
                .toList();
    }

    static void getStringRes(int index){
        if(index == -1){
            System.out.println("There is no such letter in string.");
        }
        else{
            System.out.println(index);
        }
    }
}
