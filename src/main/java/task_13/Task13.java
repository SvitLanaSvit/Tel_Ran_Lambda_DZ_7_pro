package task_13;

import java.util.stream.IntStream;

public class Task13 {
    public static void main(String[] args) {
        int a1 = 221;
        int a2 = -123;
        int a3 = 2147483647;
        int a4 = -2147483648;
        System.out.println("--FUNC CIRCLE REVERSE--");
        System.out.println(reverseIntNumber(a1));
        System.out.println(reverseIntNumber(a2));
        System.out.println(reverseIntNumber(a3));
        System.out.println(reverseIntNumber(a4));
        System.out.println("-----FUNC REVERSE-----");
        System.out.println(reverseIntNum(a1));
        System.out.println(reverseIntNum(a2));
        System.out.println(reverseIntNum(a3));
        System.out.println(reverseIntNum(a4));
        System.out.println("------WITH LAMBDA------");
        System.out.println(reverseIntNumLambda(a1));
        System.out.println(reverseIntNumLambda(a2));
        System.out.println(reverseIntNumLambda(a3));
        System.out.println(reverseIntNumLambda(a4));
    }

    static public String reverseIntNumber(int value){
        StringBuilder sb = new StringBuilder();
        if(value == -2147483648){
            value /= 10;
            value = -value;
            sb.append("-8");
            while (value > 0) {
                int remainder = value % 10;
                sb.append(remainder);
                value /= 10;
            }
            return sb.toString();
        }
        if (value < 0) {
            value = -value;
            sb.append("-");
            while (value > 0) {
                int remainder = value % 10;
                sb.append(remainder);
                value /= 10;
            }
            return sb.toString();
        }
        while (value > 0) {
            int remainder = value % 10;
            sb.append(remainder);
            value /= 10;
        }
        return sb.toString();
    }

    static public String reverseIntNum(int value){
        return reverseIntNumber(value);
    }

    static public String reverseIntNumLambda(int value){
        StringBuilder sb = new StringBuilder();
        if(value == -2147483648){
            value /= -10;
            sb.append("-8");
            getSb(sb, value);
        }
        else if(value < 0){
            value = -value;
            sb.append('-');
            getSb(sb, value);
        }
        else
        {
            getSb(sb, value);
        }
        return sb.toString();
    }

    static private StringBuilder getSb(StringBuilder sb, int value){
        String[] strMassive = Integer.toString(value).split("");
        IntStream.rangeClosed(1, strMassive.length)
                .mapToObj(i -> strMassive[strMassive.length - i])
                .toList()
                .forEach(e -> sb.append(e));
        return sb;
    }
}