import java.util.*;

public class Functions {
    /*
     * // calculatesum name ka ek function banaya gaya h
     * public static void calculateSum() {
     * 
     * Scanner sc = new Scanner(System.in);
     * int a = sc.nextInt();
     * int b = sc.nextInt();
     * int sum = a + b;
     * System.out.println("The sum of " + a + " and " + b + " is: " + sum);
     * }
     * 
     * public static void main(String[] args) { // ye h hamara main function
     * calculateSum(); // function ko call kiya gaya h
     * 
     * }
     */

    // function with parameters
    public static void calculateSum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        calculateSum(a, b); // function ko call kiya gaya h
    }

}