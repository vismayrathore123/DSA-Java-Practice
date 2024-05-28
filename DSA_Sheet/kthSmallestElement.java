
// Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

// Note :-  l and r denotes the starting and ending index of the array.

// Example 1:

// Input:
// N = 6
// arr[] = 7 10 4 3 20 15
// K = 3
// L=0 R=5

// Output : 7
// Explanation :
// 3rd smallest element in the given 
// array is 7.


// Example 2:

// Input:
// N = 5
// arr[] = 7 10 4 20 15
// K = 4 L=0 R=4
// Output : 15
// Explanation :
// 4th smallest element in the given 
// array is 15.
package dsa_sheet;
import java.util.Arrays;

public class kthSmallestElement {

    public static void main(String[] args) {
        int[] arr1 = {7, 10, 4, 3, 20, 15};
        int k1 = 3;
        int result1 = findKthSmallest(arr1, k1);
        System.out.println("Kth smallest element for example 1: " + result1); // Output: 7

        int[] arr2 = {7, 10, 4, 20, 15};
        int k2 = 4;
        int result2 = findKthSmallest(arr2, k2);
        System.out.println("Kth smallest element for example 2: " + result2); // Output: 15
    }

    public static int findKthSmallest(int[] arr, int k) {
        // Sort the array in ascending order
        Arrays.sort(arr);
        // Return the kth smallest element (k-1 because arrays are zero-indexed)
        return arr[k - 1];
    }
}
