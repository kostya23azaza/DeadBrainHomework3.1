package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondTask {
    public static <T> void asList(T[]arr) {
        ArrayList<T> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
    }
}
