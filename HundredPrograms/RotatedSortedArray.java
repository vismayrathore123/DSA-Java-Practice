public class RotatedSortedArray {
    public int search(int[] arr, int key) {
        int high = arr.length - 1;
        int low = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid overflow for large arrays

            if (arr[mid] == key) {
                return mid; // Key found, return its index
            }

            // Check if the left half is sorted
            if (arr[low] <= arr[mid]) {
                // Key is in the left half
                if (key >= arr[low] && key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // Right half is sorted
                // Key is in the right half
                if (key > arr[mid] && key <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1; // Key not found in the array
    }

    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 50, 5, 10};
        int key = 50;
        RotatedSortedArray rsa = new RotatedSortedArray();
        int resultIndex = rsa.search(arr, key);
        if (resultIndex != -1) {
            System.out.println("Key found at index: " + resultIndex);
        } else {
            System.out.println("Key not found in the array.");
        }
    }
}
