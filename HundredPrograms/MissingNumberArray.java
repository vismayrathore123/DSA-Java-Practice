public class MissingNumberArray {
    public int missingNumber(int arr[]) {
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) { // Change to < instead of <=
            sum1 = sum1 + arr[i];
        }
        int sum2 = 0;
        for (int i = 1; i <= 10; i++) { // Change to <= instead of <, and arr.length to 10
            sum2 = sum2 + i;
        }
        return sum2 - sum1;
    }

    public static void main(String[] args) {
        int arr[] = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        MissingNumberArray sc = new MissingNumberArray();
        int missing = sc.missingNumber(arr);
        System.out.println("Missing number is: " + missing); // Added print statement to see the result
    }
}
