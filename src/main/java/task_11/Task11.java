package task_11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task11 {
    public static void main(String[] args) {
        int[] arr = {1,8,5,4,8,9,3,7};
        int val = 8;
        long start = System.nanoTime();
        System.out.println(getIndexFromArray(arr, val));
        long end = System.nanoTime();
        System.out.println(end - start);

        long start2 = System.nanoTime();
        int[] arrNew = getIndexFromArray2(arr, val);
        if(arrNew.length == 0){
            System.out.println("There are no such.");
        }
        else{
            System.out.println(Arrays.toString(arrNew));
        }
        long end2 = System.nanoTime();
        System.out.println(end2 - start2);
    }

    static String getIndexFromArray(int[] arr, int val){
        int countOfSuch = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
            int first = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int second = arr[j];

                if(first + second == val){
                    sb
                            .append(first)
                            .append(" (with index [")
                            .append(i).append("]) + ")
                            .append(second).append(" (with index [")
                            .append(j).append("]) = ")
                            .append(val).append("\n");
                    countOfSuch++;
                }
            }
        }

        if(countOfSuch == 0){
            return "There are no such.";
        }
        else{
           return sb.toString();
        }
    }

    static int[] getIndexFromArray2(int[] arr, int val){
        Map<Integer, Integer> map = new HashMap<>();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < length; i++) {
            int complete = val - arr[i];
            if(map.containsKey(complete) && map.get(complete) != i){
                return new int[]{i, map.get(complete)};
            }
        }
        return new int[]{};
    }
}
