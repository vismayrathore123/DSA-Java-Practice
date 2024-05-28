public class LargestAndSmallest {
    public int findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int findSmallest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 10, 7, 9};
        LargestAndSmallest obj = new LargestAndSmallest();
        int largest = obj.findLargest(arr);
        int smallest = obj.findSmallest(arr);
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
