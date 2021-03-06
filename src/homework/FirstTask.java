package homework;

import java.util.Arrays;

public class FirstTask {
    public static void swap(Object[]arr,int firstIndex,int secondIndex) {
        Object sw = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = sw;
        System.out.println(Arrays.toString(arr));
    }
}
