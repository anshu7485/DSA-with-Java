public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        // Outer loop for number of passes
        for (int turn = 0; turn < arr.length - 1; turn++) {

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap if the element found is greater than the next element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

}

    // Selection Sort implementation


    public static void selectionSort(int arr[]){

        for (int i =0; i<arr.length-1; i++){
            int minpos= i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[minpos]>arr[j]){

                    minpos=j;
                }

            }
            

        int temp = arr[minpos];
        arr[minpos] = arr[i];
        arr[i] = temp;

    }
}


    public static void main(String[] args) {

        // Example array to sort
        int arr[] = { 5, 4, 1, 3, 2 };
        // bubbleSort(arr);
        // printArray(arr);

        selectionSort(arr);
        printArray(arr);
    }
}
