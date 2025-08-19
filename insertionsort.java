public class insertionsort {

    public static void insertionSort(int arr[]) {
        // Traverse through 1 to arr.length
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;

            // Shift elements of arr[0..i-1], that are greater than current,
            // to one position ahead of their current position
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int arr[] = { 5, 4, 1, 3, 2 };
        insertionSort(arr);
        printArray(arr);

    }
}
