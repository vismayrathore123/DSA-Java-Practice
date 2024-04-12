public class Count1inBinaryArray {
    public int  count(int arr[]){
    int n=arr.length;
    int ans=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==1){
            ans=n-i;
            break;
        }
    }
    return ans;
    }
    public static void main(String[] args) {
        int arr[]={0,0,0,1,0,1,1,1,1};
        Count1inBinaryArray sc= new Count1inBinaryArray();
        sc.count(arr);
    }
}
