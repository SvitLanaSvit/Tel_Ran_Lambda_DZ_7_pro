package task_6;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int length  = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(Arrays.stream(arr)
                .filter(e -> e % 2 == 0)
                .toArray()));
    }
}
