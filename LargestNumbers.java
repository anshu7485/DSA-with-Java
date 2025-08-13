import java.util.*;

public class LargestNumbers {

    public static int getlargestNumber(int numbers[]){
        int largest=Integer.MIN_VALUE; // Initialize largest  to the smallest possible integer
        for (int i =0; i<numbers.length; i++) {
            if (largest< numbers[i]) {
                largest = numbers[i]; // Update largest if a larger number is found
            }
        }
        return largest; // Return the largest number found
    }

    public static void main(String[] args){
        int numbers[] = { 1,2,6,3,5 };
        int largest = getlargestNumber(numbers);
        System.out.println("Largest number in the array is: " + largest);

    }
}
