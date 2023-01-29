public class BinarySearch {
    public static void main (String[] args) {
        boolean[] arr = new boolean[]{false, false, false, true, true, true};
        System.out.println(binarySearch(arr));
    }


    // Find the first true in boolean array
    public static int binarySearch (boolean[] arr) {
        // int index = 0;
        int lo = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (lo <= high) {
            mid = (lo + high) / 2;
            if (!arr[mid]) {
                // if current is false
                // move pointer to start from next element
                lo = mid + 1;
            } else {
                // otherwise
                // if current is true
                // move high to the value before it
                high = mid - 1;
            }
        }

        // Trace
        // If true is in the middle
        // then high = 2 - 1 = 1;
        // mid -> 0 + 1 / 2 -> 0
        // lo = 0 + 1
        // mid -> 1 + 1 / 2 -> 1
        // lo = 1 + 1 = 2

        return lo;
    }
}
