import java.util.Arrays;

public class SecondLargestElement {
    public int secondLargest(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        // If array length is less than 2, there is no second largest element
        if (n < 2) {
            System.out.println("No second largest element exists.");
            return -1;
        }
        // Return the second last element, which is the second largest in a sorted array
        return arr[n - 2];
    }

    public static void main(String[] args) {
        int arr[] = {7, 6, 5, 4, 1, 2, 3};
        SecondLargestElement sc = new SecondLargestElement();
        int secondLargest = sc.secondLargest(arr);
        System.out.println("Second largest element: " + secondLargest);
    }
}
