import java.util.*;

public class MaxSubArray {

    public static void maxsubarraysum(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = start; j < numbers.length; j++) {
                int end = j;
                currentSum = 0; // Reset current sum for new subarray
                for (int k = start; k <= end; k++) {
                    currentSum += numbers[k];
                }
                System.out.println("Current Sum: " + " " + currentSum + ", ");
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Final Max Sum: " + maxSum);

    }

    public static void main(String[] args) {
        // int numbers[] = { 2, 4, 6, 8, 10 };
        int numbers[]={1,-2,6,-1,3};
        maxsubarraysum(numbers);

    }
}
