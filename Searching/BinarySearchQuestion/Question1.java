//Find the number of rotations in a circularly sorted array
//Given a circularly sorted integer array, find the total number of times the array is rotated. Assume there are no duplicates in the array, and the rotation is in the anti-clockwise direction.
//For example,

//Input:  nums = [8, 9, 10, 2, 5, 6]
//Output: The array is rotated 3 times  
//Input:  nums = [2, 5, 6, 8, 9, 10]
//Output: The array is rotated 0 times
package searching.BinarySearchQuestion;

import java.util.Arrays;

public class Question1 {
    public static int findRotationCount(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                return left; // No rotation
            }

            int mid = left + (right - left) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid + arr.length - 1) % arr.length;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            } else if (arr[mid] <= arr[right]) {
                right = mid - 1;
            } else if (arr[mid] >= arr[left]) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {8, 9, 10, 2, 5, 6};
        int rotations = findRotationCount(arr);
        System.out.println("The array is rotated " + rotations + " times");
    }
}
