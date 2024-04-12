
// // Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

// // Examples:

// // Input: arr[] = {3, 5, 4, 1, 9}
// // Output: Minimum element is: 1
// //               Maximum element is: 9

// // Input: arr[] = {22, 14, 8, 17, 35, 3}
// // Output:  Minimum element is: 3
// //               Maximum element is: 35
// package DSA_Sheet;
// import java.lang.Integer;

// public class MaxandMin {
//     // Changed the argument of minNumber method from int N to int arr.length
//     public static int minNumber(int arr[], int N) {
//         int min = Integer.MAX_VALUE; // Changed Integer.MAX_VALUE to Integer.MAX_VALUE
//         for (int i = 0; i < N; i++) {
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }
//         return min;
//     }

//     // Changed the argument of maxNumber method from int N to int arr.length
//     public static int maxNumber(int arr[], int N) {
//         int max = Integer.MIN_VALUE; // Changed Integer.MIN_VALUE to Integer.MIN_VALUE
//         for (int i = 0; i < N; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }

//     public static void main(String[] args) {
//         int arr[] = {22, 14, 8, 17, 35, 3};

//         // Changed the second argument of maxNumber and minNumber method calls to arr.length
//         System.out.println("maximum number is " + maxNumber(arr, arr.length));
//         System.out.println("minimum number is " + minNumber(arr, arr.length));
//     }
// }
