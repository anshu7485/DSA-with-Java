import java.util.*;

public class arrays {

    public static void main(String[] args) {

        // creating an array of integers
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // chem
        marks[2] = sc.nextInt(); // math

        System.out.println("phy:" + marks[0]);
        System.out.println("chem:" + marks[1]);
        System.out.println("math:" + marks[2]);


        // for update a marks in a future
        marks[2]=100;
        System.out.println("math:" + marks[2]);


        // calculate a percentage of this array
        int percentage=(marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage:" + percentage + "%");


        // creating an array of strings
        // String fruits[] = {'Apple', 'Banana', 'Cherry'};

    }
}
