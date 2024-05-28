public class ReverseString {
    public String reverseString(String str){
        int n=str.length();
        String result="";
        for(int i=n-1;i>=0;i--){
            result= result+str.charAt(i);
        }
        return result;
    }


    public static void main(String[] args) {
        String str = "Evision";
        ReverseString sc= new ReverseString();
        System.out.println(sc.reverseString(str));
    }
}
