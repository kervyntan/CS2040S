public class BubbleSort {
    public static void main (String[] args) {
        int[] array = new int[]{1,4,2,3,6,7,5,10};
        int[] result = bubblesort(array);
        printArray(result);
    }

    // public static void swap (int first, int second) {
    //     int temp = first;
    //     first = second;
    //     second = temp;
    // }

    public static int[] bubblesort (int[] arr) {
        // Outer loop iterates over each element in the input array
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop helps to iterate, compare and swap the values in the array
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swapping 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        return arr;
    }

    public static void printArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
