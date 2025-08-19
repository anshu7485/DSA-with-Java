
import java.util.Arrays;
import java.util.Collections;

public class inbuildsort1 {

    public static void main(String[] args) {
        // Use Integer[] instead of int[]
        Integer arr[] = { 5, 4, 1, 3, 2 };

        // Sorting in reverse (descending) order
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}


