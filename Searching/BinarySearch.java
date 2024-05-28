package searching;
public class BinarySearch {
    public static int PrintBinarySearch(int arr[], int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<=target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
     return -1;   
    }
    public static void main(String[] args) {
        int arr[]={2,8,9,10,16,52,100};
        int target=10;
        int ans=PrintBinarySearch(arr,target);
        if(ans!=-1){
            System.out.println("element found at index"+ ans);
        }else{
            System.out.println("element not found ");
        }
    }
}
