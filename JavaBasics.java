import java.util.*; //FOR USER INPUT

public class JavaBasics {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

        // declaration of variables
        /*
         * int a = 20;
         * int b = 30;
         * String name = "anshu singh";
         * System.out.print(name);
         * System.out.println(" " + a + " " + b);
         */

        // sum of two numbers
        /*
         * int a = 20;
         * int b = 30;
         * int sum = a + b;
         * System.out.println("The sum of " + a + " and " + b + " is: " + sum);
         */

        // sum of two number using a user input

        /*
         * Scanner sc = new Scanner(System.in);
         * int a = sc.nextInt();
         * int b = sc.nextInt();
         * int sum = a + b;
         * System.out.println("The sum of " + a + " and " + b + " is: " + sum);
         */

        //  conditional statements
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input >= 18) {
            System.out.println("You are a eligible for giving the vote");
        } else {
            System.out.println("You are not eligible for giving the vote");
        }

    }
}
