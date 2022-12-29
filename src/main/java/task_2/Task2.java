package task_2;

import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
        System.out.println(getFibonacciCircle(10));
        System.out.println(getFibonacciRecursion(10));
        System.out.println(getFibonacciStream(10));
    }

    static int getFibonacciRecursion(int n){
        if(n == 0 || n == 1) {
            return n;
        }
        return getFibonacciRecursion(n - 1) + getFibonacciRecursion(n - 2);
    }

    static int getFibonacciCircle(int n){
        if(n == 0 || n == 1) {
            return n;
        }

        int res = 0;
        int prev = 1;
        int prevPrev = 0;
        for (int i = 2; i <= n; i++) {
            res = prev + prevPrev;
            prevPrev = prev;
            prev = res;
        }
        return res;
    }

    static int getFibonacciStream(int n){
        return Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(n)
                .skip(n - 1)
                .findFirst()
                .get()[1];
    }
}


