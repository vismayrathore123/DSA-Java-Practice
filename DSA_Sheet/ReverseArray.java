package DSA_Sheet;

// Given an array (or string), the task is to reverse the array/string.

// Examples:

// Input: original_array[] = {1, 2, 3} 
// Output: array_reversed[] = {3, 2, 1}

public class ReverseArray {
    public int reverseArray(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
        return 0;
    }


    public static void main(String[] args){
        int arr[]={1,2,3};
        ReverseArray ar= new ReverseArray();
        ar.reverseArray(arr);
    }
}
