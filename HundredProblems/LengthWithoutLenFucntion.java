package hundredproblems;

public class LengthWithoutLenFucntion {
    public static int  lenCustomFunction(int[] arr){
        int len=0;
    for(int i:arr){
            len++;
        }
        return len;
    }
    public static void main(String[] args) {
     int arr[]={1,2,3,4};
    int result= LengthWithoutLenFucntion.lenCustomFunction(arr);
    System.out.println(result);

    }
    
}
