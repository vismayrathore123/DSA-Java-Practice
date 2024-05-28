package hundredproblems.arrayQuestion;
import java.util.*;

public class SeprateOddEven {
    public static int[] separate(int arr[]) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenList.add(arr[i]); // Append even number to evenList
            } else {
                oddList.add(arr[i]); // Append odd number to oddList
            }
        }

        int[] result = new int[arr.length];
        int index = 0;

        // Copy even numbers first
        for (int even : evenList) {
            result[index++] = even;
        }

        // Copy odd numbers next
        for (int odd : oddList) {
            result[index++] = odd;
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {12, 17, 70, 15, 22, 65, 21, 90};
        int[] result = SeprateOddEven.separate(arr);

        // Print the separated array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
