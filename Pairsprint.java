public class Pairsprint {

    public static void pairprint(int numbers[]) {

        int tp = 0; // total pairs

        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("(" + numbers[i] + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }

        System.out.println("Total pairs: " + tp);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        pairprint(numbers);

    }

}
