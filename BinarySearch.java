import java.util.*;

public class BinarySearch {
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2; // Calculate mid index

            if (numbers[mid] == key) {
                return mid; // Target found
            } else if (numbers[mid] < key) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }
public static void main(String[] args){
    int numbers[] = {2,4,6,8,10,12};
    int key = 10;
    System.out.println("index for key" + " "+ key + " " + "is:" + binarySearch(numbers, key));

}

    
}
