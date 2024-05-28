package sorting;

public class BinarySearch {

public static int  searchBubble(int arr[], int key){
            int low=0;
            int high=arr.length-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[mid]==key){
                    return mid;
                }
                else if (key>arr[mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
                }
                return -1;
}

    public static void main(String[] args){
        int arr[]={-4,-3,-2,0,1,2,3,4};
        int key=2;
        BinarySearch.searchBubble(arr, key);
    }
}
