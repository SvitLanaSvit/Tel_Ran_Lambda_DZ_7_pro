package task_8;

import java.util.Arrays;
import java.util.Comparator;

public class Task8 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int length = arr.length;;
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));
        int[] sortedArr = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(e -> e)
                .limit(7)
                .toArray();

        System.out.println(Arrays.toString(sortedArr));
    }
}
